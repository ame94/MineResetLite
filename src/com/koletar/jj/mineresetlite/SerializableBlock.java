package com.koletar.jj.mineresetlite;

import org.bukkit.Material;

/**
 * @author jjkoletar
 */
public class SerializableBlock {
    private Material mat;
    private String matName;

    public SerializableBlock(Material material) throws NullPointerException {
        mat = material;
        if (material == null) {
            throw new NullPointerException();
        } else {
            matName = mat.name();
        }
    }

    public Material getMat() {
        return mat;
    }

    public String toString() {
        return mat.toString();
    }

    public String getMaterialName() {
        return matName;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof  SerializableBlock) {
            SerializableBlock other = (SerializableBlock)o;
            if (mat != null && other != null) {
                return matName.equalsIgnoreCase(other.matName);
            }
        }
        return false;
    }
}
