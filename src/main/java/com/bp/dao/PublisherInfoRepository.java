package com.bp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.dao.entity.PublisherInfo;

public interface PublisherInfoRepository extends JpaRepository<PublisherInfo, Long> {

}
