package com.rodrigosoares.meetingroom.studyclass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "studyroom")
public class Room {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		@Column(name = "name", nullable = false)
		private String name;
		@Column(name = "date", nullable = false)
		private String date;
		@Column(name = "startHour", nullable = false)
		private String startHour;
		 @Column(name = "endHour", nullable = false)
		private String endHour;
		 @Column(name = "theme", nullable = false)
		private String theme;
		
		public Room() {
			
		}

		public Room(long id, String name, String date, String startHour, String endHour, String theme) {
			super();
			this.id = id;
			this.name = name;
			this.date = date;
			this.startHour = startHour;
			this.endHour = endHour;
			this.theme = theme;
		}

		public long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getDate() {
			return date;
		}

		public String getStartHour() {
			return startHour;
		}

		public String getEndHour() {
			return endHour;
		}

		public String getTheme() {
			return theme;
		}

		public void setId(long id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public void setStartHour(String startHour) {
			this.startHour = startHour;
		}

		public void setEndHour(String endHour) {
			this.endHour = endHour;
		}

		public void setTheme(String theme) {
			this.theme = theme;
		}

		@Override
		public String toString() {
			return "Room [id=" + id + ", name=" + name + ", date=" + date + ", startHour=" + startHour + ", endHour="
					+ endHour + ", Theme=" + theme + "]";
		}
		
		
		

}
