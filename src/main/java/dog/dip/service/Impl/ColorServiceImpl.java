package dog.dip.service.Impl;

import dog.dip.entity.Color;
import dog.dip.repository.ColorRepository;
import dog.dip.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public class ColorServiceImpl implements ColorService{
    @Autowired
    ColorRepository colorRepository;

    @Override
    public Color addColor(Color color) {
        Color saveColor = colorRepository.saveAndFlush(color);
        return saveColor;
    }

    @Override
    public void delete(long id) {
        colorRepository.delete(id);
    }

    @Override
    public Color getByTitle(String title) {
        return colorRepository.findByTitle(title);
    }

    @Override
    public Color editColor(Color color) {
        return colorRepository.saveAndFlush(color);
    }

    @Override
    public List<Color> getAll() {
        return colorRepository.findAll();
    }
}
