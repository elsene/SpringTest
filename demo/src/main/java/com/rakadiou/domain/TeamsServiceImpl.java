package com.rakadiou.domain;

import com.rakadiou.application.ObjectApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

@Service
public class TeamsServiceImpl implements TeamsService {

    static Logger log = Logger.getLogger(TeamsServiceImpl.class.getName());

    @Autowired
    RestTemplate restTemplate;
    final String path = "C:\\Users\\LENOVO\\Downloads\\test\\demo\\src\\main\\resources\\application.properties";


    @Override
    public List<Team> getTeams(String code) {
        try (InputStream input = new FileInputStream(path)) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);
            HttpHeaders headers = new HttpHeaders();
            headers.add(prop.getProperty("app.key"), prop.getProperty("app.token"));
          headers.setContentType(MediaType.APPLICATION_JSON);

            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<String> entity = new HttpEntity<String>(headers);

            ObjectApi objectApi = getResultFromApi(code, entity);
            log.info("Response Api" + objectApi.toString() + "Response User" +
                    objectApi.getTeams().toString() +
                    "Request" + entity + "Number of teams" + objectApi.getTeams().size());

            return objectApi.getTeams();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private ObjectApi getResultFromApi(String code, HttpEntity<String> entity) {
        ObjectApi objectApi = restTemplate.exchange("http://api.football-data.org/v2/competitions/" + code + "/teams", HttpMethod.GET, entity, ObjectApi.class).getBody();
        return objectApi;
    }
    /*
    private ObjectApi getResultFromApi(String code, HttpEntity<String> entity) {
        ObjectApi objectApi = restTemplate.exchange("http://api.football-data.org/v2/competitions/" + code + "/teams", HttpMethod.GET, entity, ObjectApi.class).getBody();
        return objectApi;
    }*/

}
