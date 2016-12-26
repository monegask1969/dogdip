package dog.dip.service;

import dog.dip.entity.Color;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public interface ColorService {
    Color addColor(Color color);
    void delete(long id);
    Color getByTitle(String title);
    Color editColor(Color color);
    List<Color> getAll();
}
