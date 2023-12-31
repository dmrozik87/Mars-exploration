package com.codecool.marsexploration.mapexplorer.configuration;

import com.codecool.marsexploration.mapexplorer.maploader.model.Map;

public class ResourcesValidator implements Validator{
    @Override
    public boolean isValid(ConfigurationParameters configurationParameters, Map map) {
        return !configurationParameters.symbols().isEmpty();
    }
}
