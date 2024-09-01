package com.shlok.blackcoffer;

public class item_profile {
    private int profile_pic;
    private String profile_name;
    private String profile_Detail;
    private String profile_distance;
    private String profile_interest;
    private String profile_status;

    public int getProfile_pic() {
        return profile_pic;
    }

    public String getProfile_name() {
        return profile_name;
    }

    public String getProfile_Detail() {
        return profile_Detail;
    }

    public String getProfile_distance() {
        return profile_distance;
    }


    public String getProfile_interest() {
        return profile_interest;
    }

    public String getProfile_status() {
        return profile_status;
    }

    public item_profile(int profile_pic, String profile_name, String profile_Detail, String profile_distance,
                        String profile_interest, String profile_status) {
        this.profile_pic = profile_pic;
        this.profile_name = profile_name;
        this.profile_Detail = profile_Detail;
        this.profile_distance = profile_distance;
        this.profile_interest = profile_interest;
        this.profile_status = profile_status;
    }

}
