package com.example.timebanksql.vo;

public class ServiceVo {
    public String id;
    public String content;
    public String older;

    public String oldernumber;
    public String hour;
    public String starttime;

    public String date;
    public String typeservice;
    public String addressolder;
    public String volunteer;

    public String hourtoken;

    public String volunteernumber;
    public String rankservice;
    public String status;

    public void setId(String id){
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getOldernumber() {
        return oldernumber;
    }

    public String getHourtoken() {
        return hourtoken;
    }

    public String getVolunteernumber() {
        return volunteernumber;
    }

    public void setVolunteernumber(String volunteernumber) {
        this.volunteernumber = volunteernumber;
    }

    public void setHourtoken(String hourtoken) {
        this.hourtoken = hourtoken;
    }

    public void setOldernumber(String oldernumber) {
        this.oldernumber = oldernumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public String getOlder() {
        return older;
    }

    public void setOlder(String older) {
        this.older = older;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getTypeservice() {
        return typeservice;
    }

    public String getRankservice() {
        return rankservice;
    }

    public void setRankservice(String rankservice) {
        this.rankservice = rankservice;
    }

    public String getAddressolder() {
        return addressolder;
    }

    public void setAddressolder(String addressolder) {
        this.addressolder = addressolder;
    }

    public void setTypeservice(String typeservice) {
        this.typeservice = typeservice;
    }

    public String getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(String volunteer) {
        this.volunteer = volunteer;
    }
}
