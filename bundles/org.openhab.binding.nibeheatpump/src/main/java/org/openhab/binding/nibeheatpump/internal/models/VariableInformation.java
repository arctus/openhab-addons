/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.nibeheatpump.internal.models;

/**
 * Class for VariableInformation
 *
 * @author Pauli Anttila - Initial contribution
 */
public class VariableInformation {

    public enum NibeDataType {
        U8,
        U16,
        U32,
        S8,
        S16,
        S32
    }

    public enum Type {
        SENSOR,
        SETTING
    }

    public int factor;
    public NibeDataType dataType;
    public Type type;
    public double threshold;
    public double minValue;
    public double maxValue;
    public String variable;

    public VariableInformation() {
    }

    public VariableInformation(int factor, NibeDataType dataType, Type type, String variable) {
        this(factor, dataType, type, 0, variable);
    }

    public VariableInformation(int factor, NibeDataType dataType, Type type, double threshold, String variable) {
        this(factor, dataType, type, threshold, Double.MIN_VALUE, Double.MAX_VALUE, variable);
    }

    public VariableInformation(int factor, NibeDataType dataType, Type type, double threshold, double minValue,
            double maxValue, String variable) {
        this.factor = factor;
        this.dataType = dataType;
        this.type = type;
        this.threshold = threshold;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.variable = variable;
    }

    public static VariableInformation getVariableInfo(PumpModel model, int key) {
        switch (model) {
            case F1X45:
                return F1X45.getVariableInfo(key);
            case F1X55:
                return F1X55.getVariableInfo(key);
            case F750:
                return F750.getVariableInfo(key);
            case F470:
                return F470.getVariableInfo(key);
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        String str = "";

        str += "Factor = " + factor;
        str += ", DataType = " + dataType;
        str += ", Type = " + type;
        str += ", Threshold = " + threshold;
        str += ", MinValue = " + minValue;
        str += ", MaxValue = " + maxValue;
        str += ", VariableName = " + variable;

        return str;
    }
}
