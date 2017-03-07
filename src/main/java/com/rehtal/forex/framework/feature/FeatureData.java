package com.rehtal.forex.framework.feature;

public class FeatureData<T> {
  public enum FeatureTypeEnum {
    DISCRETIZATION, CONTINUOUS,;
  }

  private FeatureTypeEnum featureType;
  private T value;

  public FeatureData(FeatureTypeEnum featureType, T value) {
    this.featureType = featureType;
    this.value = value;
  }

  public FeatureTypeEnum getFeatureType() {
    return featureType;
  }

  public T getValue() {
    return value;
  }
}
