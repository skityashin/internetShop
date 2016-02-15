package com.levelup.service.impl;

import com.levelup.model.Media;
import com.levelup.repository.MediaRepository;
import com.levelup.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Class {@link com.levelup.service.impl.MediaServiceImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@Service
public class MediaServiceImpl implements MediaService{

    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public void saveMedia(Media media) {
        if(media == null) {
            throw new IllegalArgumentException("Media cannot be null");
        }
        mediaRepository.saveMedia(media);
    }

    @Override
    public void updateMedia(Media media) {
        mediaRepository.updateMedia(media);
    }

    @Override
    public Media findById(long id_media) {
        return mediaRepository.findById(id_media);
    }

    @Override
    public List<Media> getAllMedia() {
        return mediaRepository.getAllMedia();
    }

    @Override
    public void deleteMedia(long id_media) {
        mediaRepository.deleteMedia(id_media);
    }

    @Override
    public boolean isMediaExist(long id_media) {
        return mediaRepository.isMediaExist(id_media);
    }

}

