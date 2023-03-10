package com.lcws.user.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="micro_user")
public class User {
	@Id
    private String userId;
    private String name;
    private String email;
    private String about;
}
