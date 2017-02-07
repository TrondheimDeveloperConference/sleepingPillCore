package no.java.sleepingpill.core.controller;

import no.java.sleepingpill.core.ServiceResult;
import no.java.sleepingpill.core.publicdata.PublicSessionService;
import org.jsonbuddy.JsonFactory;
import spark.Request;
import spark.Response;
import spark.Spark;

import static no.java.sleepingpill.core.util.JsonUtil.jsonBuddyString;

public class PublicDataController {

    public void initSpark() {
        Spark.get(HttpPaths.PUBLIC_GET_SESSION_FOR_CONFERENCE,this::sessionsForConference,jsonBuddyString());
    }

    public ServiceResult sessionsForConference(Request req, Response res) {
        String conferenceSlug = req.params(":slug");
        return PublicSessionService.get().allSessionsForConference(conferenceSlug);
    }
}