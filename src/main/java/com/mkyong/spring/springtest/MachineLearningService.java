package com.mkyong.spring.springtest;

import org.springframework.stereotype.Service;

/**
 * Created by jianshen on 12/19/16.
 */
@Service("ml")
public class MachineLearningService implements DataModelService {

    public boolean isValid(String input) {
        return true;
    }

}