package com.rakadiou.application;

import java.util.ArrayList;
import java.util.List;

public class ObjectApi {
    public class Codebeautify {
        private float count;
        Filters FiltersObject;
        Competition CompetitionObject;
        List< Object > matches = new ArrayList< Object >();


        // Getter Methods

        public float getCount() {
            return count;
        }

        public Filters getFilters() {
            return FiltersObject;
        }

        public Competition getCompetition() {
            return CompetitionObject;
        }

        // Setter Methods

        public void setCount(float count) {
            this.count = count;
        }

        public void setFilters(Filters filtersObject) {
            this.FiltersObject = filtersObject;
        }

        public void setCompetition(Competition competitionObject) {
            this.CompetitionObject = competitionObject;
        }
    }
    public class Competition {
        private float id;
        Area AreaObject;
        private String name;
        private String code;
        private String plan;
        private String lastUpdated;


        // Getter Methods

        public float getId() {
            return id;
        }

        public Area getArea() {
            return AreaObject;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public String getPlan() {
            return plan;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        // Setter Methods

        public void setId(float id) {
            this.id = id;
        }

        public void setArea(Area areaObject) {
            this.AreaObject = areaObject;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setPlan(String plan) {
            this.plan = plan;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }
    }
    public class Area {
        private float id;
        private String name;


        // Getter Methods

        public float getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        // Setter Methods

        public void setId(float id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public class Filters {


        // Getter Methods



        // Setter Methods


    }
}
