package ir.ea2.android_notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
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
        int requestPendingIntent=100;
        //Set Notification's Option's
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context).setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(context.getResources().getString(R.string.notification_text))
                .setContentTitle(context.getResources().getString(R.string.notification_title))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setColor(context.getResources().getColor(R.color.notification));
        //Set Intent For Using In TaskStackBuilder .
        Intent intent = new Intent(context, SecondaryActivity.class);
        // Set backIntent For Going Previous Activity .
        Intent backIntent = new Intent(context, MainActivity.class);
        backIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //Set TaskStackBuilder For Using In PendingIntent .
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntent(intent);
        //Set PendingIntent For Using In setContentIntent() .
        PendingIntent pendingIntent = PendingIntent.getActivities(context , requestPendingIntent++,new Intent[]{backIntent,intent},PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }

    public void largeIconNotification(Context context){
        //Set NotificationId : This is For Avoid From Conflicted Notification's Together .
        int notificationId = 1001;
        int requestPendingIntent=100;
        //Set Notification's Option's
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context).setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(context.getResources().getString(R.string.notification_text))
                .setContentTitle(context.getResources().getString(R.string.notification_title))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(),R.drawable.notification))
                .setColor(context.getResources().getColor(R.color.notification));
        //Set Intent For Using In TaskStackBuilder .
        Intent intent = new Intent(context, SecondaryActivity.class);
        // Set backIntent For Going Previous Activity .
        Intent backIntent = new Intent(context, MainActivity.class);
        backIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //Set TaskStackBuilder For Using In PendingIntent .
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntent(intent);
        //Set PendingIntent For Using In setContentIntent() .
        PendingIntent pendingIntent = PendingIntent.getActivities(context , requestPendingIntent++,new Intent[]{backIntent,intent},PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }
}
