package Client;

import Common.Holder;

import java.io.Serializable;

public class Datahandle implements Serializable{

    private Holder dataHolder;

    public Datahandle(Holder dataHolder) {
        this.dataHolder = dataHolder;
    }

    public Holder getDataHolder() {
        return dataHolder;
    }
}
