package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta2LimitedPriorityLevelConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getAssuredConcurrencyShares();
  public A withAssuredConcurrencyShares(java.lang.Integer assuredConcurrencyShares);
  public java.lang.Boolean hasAssuredConcurrencyShares();
  
  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2LimitResponse getLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitResponse buildLimitResponse();
  public A withLimitResponse(io.kubernetes.client.openapi.models.V1beta2LimitResponse limitResponse);
  public java.lang.Boolean hasLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta2LimitResponse item);
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta2LimitResponse item);
  public interface LimitResponseNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent<io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>>{
    public N and();
    public N endLimitResponse();
    
  }
  
}