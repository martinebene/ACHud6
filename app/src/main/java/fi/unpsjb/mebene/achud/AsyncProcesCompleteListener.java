package fi.unpsjb.mebene.achud;

/**
 * Created by Martin on 06/07/2017.
 */

public interface AsyncProcesCompleteListener<File> {
    public void onTaskComplete(java.io.File result);
}
