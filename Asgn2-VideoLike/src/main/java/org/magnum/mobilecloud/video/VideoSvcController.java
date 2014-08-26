package org.magnum.mobilecloud.video;

import java.util.Collection;

import org.magnum.mobilecloud.video.ResourceNotFoundException;
import org.magnum.mobilecloud.video.client.VideoSvcApi;
import org.magnum.mobilecloud.video.repository.Video;
import org.magnum.mobilecloud.video.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.google.common.collect.Lists;


/**
 * Controller which implements the Video Service.
 * Interesting note: the VideoServiceWithOauth2 example does not have a controller because the
 * requests are being routed directly to the VideoRepository class.
 * 
 * In this assignment, have in mind that the Unit test is a kind of integration test. This is the flow:
 * - jUnit calls a method using the VideoSvcApi (for example, addVideo). It uses the api because 
 * jUnit is a client here, like an Android client. It does not have access to the implementation!
 * - Tomcat receives the request
 * - Spring does the Oauth stuff
 * - Spring locates this controller, who needs to implement the VideoSvcApi (not a literal implement,
 * as we are not doing implements
 * 
 * @author Silvio Hirashiki
 *
 */
@Controller
public class VideoSvcController {

	
	// Video Repository implementation
	@Autowired
	private VideoRepository videoRepo;
	
	
	/**
	 * Returns a list with all videos
	 * @return
	 */
	@RequestMapping(value=VideoSvcApi.VIDEO_SVC_PATH, method=RequestMethod.GET)
	public @ResponseBody Collection<Video> getVideoList() {
		return Lists.newArrayList(videoRepo.findAll());
		
	}

	
	/**
	 * Gets video by id
	 * @param id
	 * @return
	 */
	@RequestMapping(value = VideoSvcApi.VIDEO_SVC_PATH + "/{id}", method = RequestMethod.GET)
	public @ResponseBody Video getVideoById(@PathVariable("id") long id) {
		return videoRepo.findOne(id);
	}
	
	
	/**
	 * Save a Video 
	 */
	@RequestMapping(value=VideoSvcApi.VIDEO_SVC_PATH, method=RequestMethod.POST)
	public @ResponseBody Video addVideo(@RequestBody Video v) {
		return videoRepo.save(v);
	}

	
	/**
	 * Like a video - NEED TO COMPLETE !!!!!!
	 */
	@RequestMapping(value = VideoSvcApi.VIDEO_SVC_PATH + "/{id}/like", method = RequestMethod.POST)
	public void likeVideo(@PathVariable("id") long id) {
		
		Video currentVideo = videoRepo.findOne(id);
		
		if (currentVideo==null) {
			throw new ResourceNotFoundException();
		}
		
		// COMPLETE
	}
	
	
	/**
	 * Unlike a video - NEED TO COMPLETE !!!!!!
	 */
	@RequestMapping(value = VideoSvcApi.VIDEO_SVC_PATH + "/{id}/unlike", method = RequestMethod.POST)
	public void unlikeVideo(@PathVariable("id") long id) {
		
		Video currentVideo = videoRepo.findOne(id);
		
		if (currentVideo==null) {
			throw new ResourceNotFoundException();
		}
		
		// COMPLETE
	}

	// Receives GET requests to /video/search/findByName and returns all Videos
	// that have a title (e.g., Video.name) matching the "title" request
	// parameter value that is passed by the client
	@RequestMapping(value=VideoSvcApi.VIDEO_TITLE_SEARCH_PATH, method=RequestMethod.GET)
	public @ResponseBody Collection<Video> findByTitle(
			// Tell Spring to use the "title" parameter in the HTTP request's query
			// string as the value for the title method parameter
			@RequestParam(VideoSvcApi.TITLE_PARAMETER) String title
	){
		return videoRepo.findByName(title);
	}
	
	// Receives GET requests to /video/search/findByDurationLessThan and returns all Videos
	// that have a title (e.g., Video.name) matching the "title" request
	// parameter value that is passed by the client
	@RequestMapping(value=VideoSvcApi.VIDEO_DURATION_SEARCH_PATH, method=RequestMethod.GET)
	public @ResponseBody Collection<Video> findByDurationLessThan(
			// Tell Spring to use the "title" parameter in the HTTP request's query
			// string as the value for the title method parameter
			@RequestParam(VideoSvcApi.DURATION_PARAMETER) long maxduration
	){
		return videoRepo.findByDurationLessThan(maxduration);
	}
	
	
	@RequestMapping(value=VideoSvcApi.VIDEO_SVC_PATH + "/{id}/likedby", method=RequestMethod.GET)
	public Collection<String> getUsersWhoLikedVideo(@PathVariable("id") long id){
		return null;
	}
	
	
}
