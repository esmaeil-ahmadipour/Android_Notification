package ir.ea2.android_notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;

public class CustomNotification {

    private CustomNotification() {
    }

    private static final CustomNotification ourInstance = new CustomNotification();

    public static CustomNotification getInstance() {
        return ourInstance;
    }


    public void sampleNotification(Context context){
        //Set NotificationId : This is For Avoid From Conflicted Notification's Together .
        int notificationId = 1001;
        //Set Notification's Option's
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context).setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(context.getResources().getString(R.string.notification_text))
                .setContentTitle(context.getResources().getString(R.string.notification_title))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setColor(context.getResources().getColor(R.color.notification));
        //Set Intent For Using In TaskStackBuilder .
        Intent intent = new Intent(context, SecondaryActivity.class);
        //Set TaskStackBuilder For Using In PendingIntent .
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntent(intent);
        //Set PendingIntent For Using In setContentIntent() .
        PendingIntent pendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }
}
