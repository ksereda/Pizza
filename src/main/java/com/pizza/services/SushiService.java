package com.Pizza.services;

import com.Pizza.entity.Sushi;
import java.util.List;

public interface SushiService {

    List<Sushi> getSushis();

    void addSushi(Sushi sushi);

    Sushi findBySushiName(String sushiName);

    void deleteSushi(Sushi sushi);

    void updateSushi(Sushi sushi);

}
