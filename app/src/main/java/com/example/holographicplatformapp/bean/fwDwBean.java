package com.example.holographicplatformapp.bean;

import java.util.List;

public class fwDwBean {


    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * Name : 山东省公安厅
         * month : 201912
         * dbcname : 电子围栏
         * tabcname : 电子围栏
         * rows_sum : 1035597136
         */
        private String date;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        private String Name;
        private int month;
        private String dbcname;
        private String tabcname;
        private double rows_sum;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public String getDbcname() {
            return dbcname;
        }

        public void setDbcname(String dbcname) {
            this.dbcname = dbcname;
        }

        public String getTabcname() {
            return tabcname;
        }

        public void setTabcname(String tabcname) {
            this.tabcname = tabcname;
        }

        public double getRows_sum() {
            return rows_sum;
        }

        public void setRows_sum(int rows_sum) {
            this.rows_sum = rows_sum;
        }
    }
}
