package com.levelup.service;

import com.levelup.model.Media;
import java.util.List;

/**
 * Class {@link com.levelup.service.MediaService}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

public interface MediaService {

    void saveMedia (Media media);
    Media findById (long id_media);
    void updateMedia (Media media);
    void deleteMedia (long id_media);
    List<Media> getAllMedia ();
    boolean isMediaExist(long id_media);

}
