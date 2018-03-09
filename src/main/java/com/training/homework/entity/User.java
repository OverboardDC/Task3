package com.training.homework.entity;

import com.training.homework.enums.Group;

import java.util.Date;

/**
 * The user entity.
 *
 * @author  Eugene Kushpii
 * @version 1.0
 */
public class User {

    private String name;
    private String middleName;
    private String nickName;
    private String comment;
    private Group group;
    private String homePhone;
    private String mobilePhone;
    private String additionalMobilePhone;
    private String email;
    private String skype;
    private String fullAddress;
    private Date addingDate;
    private Date lastChangingDate;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAdditionalMobilePhone() {
        return additionalMobilePhone;
    }

    public void setAdditionalMobilePhone(String additionalMobilePhone) {
        this.additionalMobilePhone = additionalMobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Date getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(Date addingDate) {
        this.addingDate = addingDate;
    }

    public Date getLastChangingDate() {
        return lastChangingDate;
    }

    public void setLastChangingDate(Date lastChangingDate) {
        this.lastChangingDate = lastChangingDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhone=" + homePhone +
                ", mobilePhone=" + mobilePhone +
                ", additionalMobilePhone=" + additionalMobilePhone +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                ", addingDate=" + addingDate +
                ", lastChangingDate=" + lastChangingDate +
                '}';
    }
}
