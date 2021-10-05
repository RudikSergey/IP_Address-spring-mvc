package com.ipaddress.entity;

import javax.persistence.*;

@Entity
@Table(name = "IpAddressFive")
public class IpAddressFive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ip_address")
    private String ip_address;

    @Column(name = "device")
    private String device;

    @Column(name = "description")
    private String description;

    @Column(name = "comments")
    private String comments;

    public IpAddressFive() {
    }

    public IpAddressFive(String ip_address, String device, String description, String comments) {
        this.ip_address = ip_address;
        this.device = device;
        this.description = description;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
