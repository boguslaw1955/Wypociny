package fries.com.pl.komponenty.services;

import fries.com.pl.komponenty.model.Component;
import fries.com.pl.komponenty.repository.WypocinyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WypocinyServices
{
    private final WypocinyRepository wypocinyRepository;

    public List<Component> componentList()
    {
        return wypocinyRepository.findAll();
    }


}
