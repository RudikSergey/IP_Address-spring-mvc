package com.ipaddress.service;

import com.ipaddress.dao.IpAddressDAO;
import com.ipaddress.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IpAddressServiceImpl implements IpAddressService {

    @Autowired
    private IpAddressDAO ipAddressDAO;

    @Override
    @Transactional
    public List<IpAddress> getAllIpAddress() {
        return ipAddressDAO.getAllIpAddress();
    }

    @Override
    @Transactional
    public List<IpAddressTwo> getAllIpAddressTwo() {
        return ipAddressDAO.getAllIpAddressTwo();
    }

    @Override
    @Transactional
    public List<IpAddressThree> getAllIpAddressThree() {
        return ipAddressDAO.getAllIpAddressThree();
    }

    @Override
    @Transactional
    public List<IpAddressFour> getAllIpAddressFour() {
        return ipAddressDAO.getAllIpAddressFour();
    }

    @Override
    @Transactional
    public List<IpAddressFive> getAllIpAddressFive() {
        return ipAddressDAO.getAllIpAddressFive();
    }

    @Override
    @Transactional
    public void saveIpAddress(IpAddress ipAddress) {
        ipAddressDAO.saveIpAddress(ipAddress);
    }

    @Override
    @Transactional
    public void saveIpAddressTwo(IpAddressTwo ipAddressTwo) {
        ipAddressDAO.saveIpAddressTwo(ipAddressTwo);
    }

    @Override
    @Transactional
    public void saveIpAddressThree(IpAddressThree ipAddressThree) {
        ipAddressDAO.saveIpAddressThree(ipAddressThree);
    }

    @Override
    @Transactional
    public void saveIpAddressFour(IpAddressFour ipAddressFour) {
        ipAddressDAO.saveIpAddressFour(ipAddressFour);
    }

    @Override
    @Transactional
    public void saveIpAddressFive(IpAddressFive ipAddressFive) {
        ipAddressDAO.saveIpAddressFive(ipAddressFive);
    }

    @Override
    @Transactional
    public IpAddress getIpAddress(int id) {
        return ipAddressDAO.getIpAddress(id);
    }

    @Override
    @Transactional
    public IpAddressTwo getIpAddressTwo(int id) {
        return ipAddressDAO.getIpAddressTwo(id);
    }

    @Override
    @Transactional
    public IpAddressThree getIpAddressThree(int id) {
        return ipAddressDAO.getIpAddressThree(id);
    }

    @Override
    @Transactional
    public IpAddressFour getIpAddressFour(int id) {
        return ipAddressDAO.getIpAddressFour(id);
    }

    @Override
    @Transactional
    public IpAddressFive getIpAddressFive(int id) {
        return ipAddressDAO.getIpAddressFive(id);
    }

    @Override
    @Transactional
    public void deleteIpAddress(int id) {
        ipAddressDAO.deleteIpAddress(id);
    }

    @Override
    @Transactional
    public void deleteIpAddressTwo(int id) {
        ipAddressDAO.deleteIpAddressTwo(id);
    }

    @Override
    @Transactional
    public void deleteIpAddressThree(int id) {
        ipAddressDAO.deleteIpAddressThree(id);

    }

    @Override
    @Transactional
    public void deleteIpAddressFour(int id) {
        ipAddressDAO.deleteIpAddressFour(id);
    }

    @Override
    @Transactional
    public void deleteIpAddressFive(int id) {
        ipAddressDAO.deleteIpAddressFive(id);
    }
}
