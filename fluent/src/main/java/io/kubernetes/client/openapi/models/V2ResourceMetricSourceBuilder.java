package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2ResourceMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2ResourceMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2ResourceMetricSource,io.kubernetes.client.openapi.models.V2ResourceMetricSourceBuilder>{
  public V2ResourceMetricSourceBuilder() {
    this(false);
  }
  public V2ResourceMetricSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V2ResourceMetricSource(), validationEnabled);
  }
  public V2ResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2ResourceMetricSource(), validationEnabled);
  }
  public V2ResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2ResourceMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2ResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2ResourceMetricSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2ResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricSource instance) {
    this(instance,false);
  }
  public V2ResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2ResourceMetricSource build() {
    V2ResourceMetricSource buildable = new V2ResourceMetricSource();
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ResourceMetricSourceBuilder that = (V2ResourceMetricSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}