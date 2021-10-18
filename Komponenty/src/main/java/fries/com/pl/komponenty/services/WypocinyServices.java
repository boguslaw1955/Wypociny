package fries.com.pl.komponenty.services;

import fries.com.pl.komponenty.repository.WypocinyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class WypocinyServices
{
    private final WypocinyRepository WypocinyRepostory;

    public List<Component> listComponents()
    {
        return WypocinyRepostory.findAll();
    }

    public int  addComponent(Component component)
    {
        if(component == null)
        {
            return -1;
        }
        astecLearnRepostory.save(component);
        return 0;
    }

    public int deleteComponent(Integer component_id)
    {
        var ret = astecLearnRepostory.findById(component_id);
        if ( ret.isEmpty()) return -1;
        Component c = ret.get();
        c.setActive(false);
        astecLearnRepostory.save(c);
        return 0;
    }
}

