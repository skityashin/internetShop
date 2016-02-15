package com.levelup.repository;

import com.levelup.model.Media;
import java.util.List;

/**
 * Class {@link com.levelup.repository.MediaRepository}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */


public interface MediaRepository {

    public void saveMedia (Media media);
    public Media findById (long id_media);
    public void updateMedia (Media media);
    public void deleteMedia (long id_media);
    public List<Media> getAllMedia ();
    public boolean isMediaExist(long id_media);

}
