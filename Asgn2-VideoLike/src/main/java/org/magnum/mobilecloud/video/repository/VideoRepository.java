package org.magnum.mobilecloud.video.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * An interface for a repository that can store Video
 * objects and allow them to be searched by title.
 * 
 * Silvio:
 * Observe that this repository does not have the REST annotations, so to use this
 * you need a controller
 * 
 * @author jules
 *
 */
@Repository
public interface VideoRepository extends CrudRepository<Video, Long>{

	// Find all videos with a matching title (e.g., Video.name)
	public Collection<Video> findByName(String title);
	
}
