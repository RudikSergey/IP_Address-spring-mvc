package com.ipaddress.dao;

import com.ipaddress.entity.*;

import java.util.List;

public interface IpAddressDAO {
    public List<IpAddress> getAllIpAddress();

    public List<IpAddressTwo> getAllIpAddressTwo();

    public List<IpAddressThree> getAllIpAddressThree();

    public List<IpAddressFour> getAllIpAddressFour();

    public List<IpAddressFive> getAllIpAddressFive();


    public void saveIpAddress(IpAddress ipAddress);

    public void saveIpAddressTwo(IpAddressTwo ipAddressTwo);

    public void saveIpAddressThree(IpAddressThree ipAddressThree);

    public void saveIpAddressFour(IpAddressFour ipAddressFour);

    public void saveIpAddressFive(IpAddressFive ipAddressFive);


    public IpAddress getIpAddress(int id);

    public IpAddressTwo getIpAddressTwo(int id);

    public IpAddressThree getIpAddressThree(int id);

    public IpAddressFour getIpAddressFour(int id);

    public IpAddressFive getIpAddressFive(int id);


    public void deleteIpAddress(int id);

    public void deleteIpAddressTwo(int id);

    public void deleteIpAddressThree(int id);

    public void deleteIpAddressFour(int id);

    public void deleteIpAddressFive(int id);
}
