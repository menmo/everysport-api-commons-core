package com.everysport.api.domain.api;

import java.util.Date;
import java.util.List;

/**
 * Created by Fredrik, 2013-03-13 3:00 PM
 */

public class League extends ApiIdEntity {


    /* Used by Reflection in ResourceLinkUtils */
    public static final String RESOURCE_PATH = "/leagues";

    private String name;
    private String level;
    private Long levelId;

    private Sport sport;
    private Category category;
    private TeamClass teamClass;
    private Integer teamClassId;

    private Date startDate;
    private Date endDate;

    private Season season;
    private List<Group> groups;

    private Boolean liveScore;
    private String years;

    public TeamClass getTeamClass() {
        return teamClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

	public String getLevel()
	{
		return level;
	}

	public void setLevel(String level)
	{
		this.level = level;
	}

    public Long getLevelId()
    {
        return levelId;
    }

    public void setLevelId(Long levelId)
    {
        this.levelId = levelId;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public void setTeamClass(TeamClass teamClass) {
        this.teamClass = teamClass;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Boolean getLiveScore() {
        return liveScore;
    }

    public void setLiveScore(Boolean liveScore) {
        this.liveScore = liveScore;
    }

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }

    public void setYears(String years) {
        this.years = years;
    }

    public String getYears() {
        return years;
    }

    public void setTeamClassId(Integer teamClassId)
    {
        this.teamClassId = teamClassId;
    }

    public Integer getTeamClassId()
    {
        return teamClassId;
    }
}