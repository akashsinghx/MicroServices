package com.ltts.Team.Controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.Team.Model.Team;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Team.dao.TeamDao;
import com.ltts.Team.Model.Team;

@RestController
public class TeamController {
	@Autowired
	TeamDao td;
	@RequestMapping("/teams")
	public List<Team> getTeams()
	{
		return td.getAllTeams();
	}

} 