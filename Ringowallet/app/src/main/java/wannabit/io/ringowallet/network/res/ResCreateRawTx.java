package wannabit.io.ringowallet.network.res;

import com.google.gson.annotations.SerializedName;

public class ResCreateRawTx {

    @SerializedName("rawTransaction")
    String rawTransaction;

    public String getRawTransaction() {
        return rawTransaction;
    }

    public void setRawTransaction(String rawTransaction) {
        this.rawTransaction = rawTransaction;
    }
}
