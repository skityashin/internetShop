package com.levelup.repository.impl;

import com.levelup.model.Media;
import com.levelup.repository.MediaRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Class {@link com.levelup.repository.impl.MediaRepositoryImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@Repository
@Transactional
public class MediaRepositoryImpl implements MediaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveMedia(Media media) {
        if(media == null) {
            throw new IllegalArgumentException("Media cannot be null");
        }
        entityManager.persist(media);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Media findById(long id_media) {
        return entityManager.find(Media.class, id_media);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateMedia(Media media) {
        entityManager.merge(media);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteMedia(long id_media) {
        Media removingMedia = entityManager.find(Media.class, id_media);
        entityManager.remove(removingMedia);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Media> getAllMedia() {
        Query query = entityManager.createQuery("FROM Media");
        return (List<Media>)query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMediaExist(long id_media) {
        return entityManager.contains(id_media);
    }
}
