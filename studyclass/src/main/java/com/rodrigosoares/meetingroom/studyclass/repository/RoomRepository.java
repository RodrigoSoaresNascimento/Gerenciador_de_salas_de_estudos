package com.rodrigosoares.meetingroom.studyclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigosoares.meetingroom.studyclass.model.Room;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
