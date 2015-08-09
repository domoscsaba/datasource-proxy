package net.ttddyy.dsproxy.test;

import java.util.List;
import java.util.Map;

/**
 * @author Tadaya Tsuyukubo
 * @since 1.4
 */
public interface OutParameterHolder extends ParameterHolder {

    Map<Integer, Object> getOutParamsByIndex();

    Map<String, Object> getOutParamsByName();

    /**
     * Keys of out parameters.
     *
     * @return Integer keys.
     */
    List<Integer> getOutParamIndexes();

    /**
     * Keys of out parameters.
     *
     * @return String keys.
     */
    List<String> getOutParamNames();


}
