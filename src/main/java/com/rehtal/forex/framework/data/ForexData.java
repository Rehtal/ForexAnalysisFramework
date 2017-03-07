package com.rehtal.forex.framework.data;

import java.util.Map;

import com.rehtal.forex.framework.feature.FeatureData;
import com.rehtal.forex.message.ProtoForex.ForexPrice;

public class ForexData {
  private ForexPrice price;
  private Map<String, FeatureData<?>> featureMap;

  public ForexPrice getPrice() {
    return price;
  }

  public Map<String, FeatureData<?>> getFeatureMap() {
    return featureMap;
  }
}
