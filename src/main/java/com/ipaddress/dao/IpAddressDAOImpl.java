package com.ipaddress.dao;

import com.ipaddress.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IpAddressDAOImpl implements IpAddressDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<IpAddress> getAllIpAddress() {
        Session session = sessionFactory.getCurrentSession();
        List<IpAddress> allIpAddress = session.createQuery("from IpAddress", IpAddress.class).getResultList();
        return allIpAddress;
    }

    @Override
    public List<IpAddressTwo> getAllIpAddressTwo() {
        Session session = sessionFactory.getCurrentSession();
        List<IpAddressTwo> allIpAddressTwo = session.createQuery("from IpAddressTwo", IpAddressTwo.class).getResultList();
        return allIpAddressTwo;
    }

    @Override
    public List<IpAddressThree> getAllIpAddressThree() {
        Session session = sessionFactory.getCurrentSession();
        List<IpAddressThree> allIpAddressThree = session.createQuery("from IpAddressThree", IpAddressThree.class).getResultList();
        return allIpAddressThree;
    }

    @Override
    public List<IpAddressFour> getAllIpAddressFour() {
        Session session = sessionFactory.getCurrentSession();
        List<IpAddressFour> allIpAddressFour = session.createQuery("from IpAddressFour", IpAddressFour.class).getResultList();
        return allIpAddressFour;
    }

    @Override
    public List<IpAddressFive> getAllIpAddressFive() {
        Session session = sessionFactory.getCurrentSession();
        List<IpAddressFive> allIpAddressFive = session.createQuery("from IpAddressFive", IpAddressFive.class).getResultList();
        return allIpAddressFive;
    }

    @Override
    public void saveIpAddress(IpAddress ipAddress) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(ipAddress);
    }

    @Override
    public void saveIpAddressTwo(IpAddressTwo ipAddressTwo) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(ipAddressTwo);
    }

    @Override
    public void saveIpAddressThree(IpAddressThree ipAddressThree) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(ipAddressThree);
    }

    @Override
    public void saveIpAddressFour(IpAddressFour ipAddressFour) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(ipAddressFour);
    }

    @Override
    public void saveIpAddressFive(IpAddressFive ipAddressFive) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(ipAddressFive);
    }

    @Override
    public IpAddress getIpAddress(int id) {
        Session session = sessionFactory.getCurrentSession();
        IpAddress ipAddress = session.get(IpAddress.class, id);
        return ipAddress;
    }

    @Override
    public IpAddressTwo getIpAddressTwo(int id) {
        Session session = sessionFactory.getCurrentSession();
        IpAddressTwo ipAddressTwo = session.get(IpAddressTwo.class, id);
        return ipAddressTwo;
    }

    @Override
    public IpAddressThree getIpAddressThree(int id) {
        Session session = sessionFactory.getCurrentSession();
        IpAddressThree ipAddressThree = session.get(IpAddressThree.class, id);
        return ipAddressThree;
    }

    @Override
    public IpAddressFour getIpAddressFour(int id) {
        Session session = sessionFactory.getCurrentSession();
        IpAddressFour ipAddressFour = session.get(IpAddressFour.class, id);
        return ipAddressFour;
    }

    @Override
    public IpAddressFive getIpAddressFive(int id) {
        Session session = sessionFactory.getCurrentSession();
        IpAddressFive ipAddressFive = session.get(IpAddressFive.class, id);
        return ipAddressFive;
    }

    @Override
    public void deleteIpAddress(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<IpAddress> query = session.createQuery("delete from IpAddress where id=:ipAddressId");
        query.setParameter("ipAddressId", id);
        query.executeUpdate();
    }

    @Override
    public void deleteIpAddressTwo(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<IpAddressTwo> query = session.createQuery("delete from IpAddressTwo where id=:ipAddressId");
        query.setParameter("ipAddressId", id);
        query.executeUpdate();
    }

    @Override
    public void deleteIpAddressThree(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<IpAddressThree> query = session.createQuery("delete from IpAddressThree where id=:ipAddressId");
        query.setParameter("ipAddressId", id);
        query.executeUpdate();
    }

    @Override
    public void deleteIpAddressFour(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<IpAddressFour> query = session.createQuery("delete from IpAddressFour where id=:ipAddressId");
        query.setParameter("ipAddressId", id);
        query.executeUpdate();
    }

    @Override
    public void deleteIpAddressFive(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<IpAddressFive> query = session.createQuery("delete from IpAddressFive where id=:ipAddressId");
        query.setParameter("ipAddressId", id);
        query.executeUpdate();
    }
}
