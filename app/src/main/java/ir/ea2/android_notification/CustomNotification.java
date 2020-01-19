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

    void sampleNotification(Context context) {
        //Set NotificationId : This is For Avoid From Conflicted Notification's Together .
        int notificationId = 1001;
        int requestPendingIntent = 101;
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
        PendingIntent pendingIntent = PendingIntent.getActivities(context, requestPendingIntent++, new Intent[]{backIntent, intent}, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }

    void largeIconNotification(Context context) {
        //Set NotificationId : This is For Avoid From Conflicted Notification's Together .
        int notificationId = 1002;
        int requestPendingIntent = 202;
        //Set Notification's Option's
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context).setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(context.getResources().getString(R.string.notification_text))
                .setContentTitle(context.getResources().getString(R.string.notification_title))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.notification))
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
        PendingIntent pendingIntent = PendingIntent.getActivities(context, requestPendingIntent++, new Intent[]{backIntent, intent}, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }

    void priorityNotification(Context context) {
        //Set NotificationId : This is For Avoid From Conflicted Notification's Together .
        int notificationId = 1003;
        int requestPendingIntent = 303;

        //Set Intent For Using In TaskStackBuilder .
        Intent intent = new Intent(context, SecondaryActivity.class);
        // Set backIntent For Going Previous Activity .
        Intent backIntent = new Intent(context, MainActivity.class);
        backIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //Set TaskStackBuilder For Using In PendingIntent .
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntent(intent);
        //Set PendingIntent For Using In setContentIntent() .
        PendingIntent pendingIntent = PendingIntent.getActivities(context, requestPendingIntent++, new Intent[]{backIntent, intent}, PendingIntent.FLAG_UPDATE_CURRENT);

        //Set Notification's Option's
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context).setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(context.getResources().getString(R.string.notification_text))
                .setContentTitle(context.getResources().getString(R.string.notification_title))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                //Send Notification Front Toolbar.
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                //Lock Notification On Top & Disable Swipe for Clear Notification.
                .setOngoing(true)
                .addAction(R.drawable.ic_add_item, "Add Item To Cart", pendingIntent)
                //Set Color For NotificationSmallIcon & App Name .
                .setColor(context.getResources().getColor(R.color.notification));

        //Set Intent To Notification.
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }

    void bigTextStyleNotification(Context context) {
        //Set NotificationId : This is For Avoid From Conflicted Notification's Together .
        int notificationId = 1004;
        int requestPendingIntent = 404;

        //Set Intent For Using In TaskStackBuilder .
        Intent intent = new Intent(context, SecondaryActivity.class);
        // Set backIntent For Going Previous Activity .
        Intent backIntent = new Intent(context, MainActivity.class);
        backIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //Set TaskStackBuilder For Using In PendingIntent .
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntent(intent);
        //Set PendingIntent For Using In setContentIntent() .
        PendingIntent pendingIntent = PendingIntent.getActivities(context, requestPendingIntent++, new Intent[]{backIntent, intent}, PendingIntent.FLAG_UPDATE_CURRENT);

        //Set Notification's Option's
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context).setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(context.getResources().getString(R.string.notification_text))
                .setContentTitle(context.getResources().getString(R.string.notification_title))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                //Set Color For NotificationSmallIcon & App Name .
                .setColor(context.getResources().getColor(R.color.notification));

        //Set Custom Big Text Style .
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle().bigText(context.getResources()
                                                                                                             .getString(R.string.notification_bigTextStyle));
        //Set Style For Notification By Passing BigTextStyle.
        notification.setStyle(bigTextStyle);

        //Set Intent To Notification.
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }

    void bigPictureStyleNotification(Context context) {
        //Set NotificationId : This is For Avoid From Conflicted Notification's Together .
        int notificationId = 1005;
        int requestPendingIntent = 505;

        //Set Intent For Using In TaskStackBuilder .
        Intent intent = new Intent(context, SecondaryActivity.class);
        // Set backIntent For Going Previous Activity .
        Intent backIntent = new Intent(context, MainActivity.class);
        backIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //Set TaskStackBuilder For Using In PendingIntent .
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntent(intent);
        //Set PendingIntent For Using In setContentIntent() .
        PendingIntent pendingIntent = PendingIntent.getActivities(context, requestPendingIntent++, new Intent[]{backIntent, intent}, PendingIntent.FLAG_UPDATE_CURRENT);

        //Set Notification's Option's
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context).setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(context.getResources().getString(R.string.notification_text))
                .setContentTitle(context.getResources().getString(R.string.notification_title))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                //Set Color For NotificationSmallIcon & App Name .
                .setColor(context.getResources().getColor(R.color.notification));

        //Set Custom Style .
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle()
                .bigPicture(BitmapFactory.decodeResource(context.getResources(), R.drawable.picture_notification));
        //Set Style For Notification By Passing Custom Style.
        notification.setStyle(bigPictureStyle);

        //Set Intent To Notification.
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }

    void inboxStyleNotification(Context context) {
        //Set NotificationId : This is For Avoid From Conflicted Notification's Together .
        int notificationId = 1006;
        int requestPendingIntent = 606;

        //Set Intent For Using In TaskStackBuilder .
        Intent intent = new Intent(context, SecondaryActivity.class);
        // Set backIntent For Going Previous Activity .
        Intent backIntent = new Intent(context, MainActivity.class);
        backIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //Set TaskStackBuilder For Using In PendingIntent .
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntent(intent);
        //Set PendingIntent For Using In setContentIntent() .
        PendingIntent pendingIntent = PendingIntent.getActivities(context, requestPendingIntent++, new Intent[]{backIntent, intent}, PendingIntent.FLAG_UPDATE_CURRENT);

        //Set Notification's Option's
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context).setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(context.getResources().getString(R.string.notification_text))
                .setContentTitle(context.getResources().getString(R.string.notification_title))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                //Set Color For NotificationSmallIcon & App Name .
                .setColor(context.getResources().getColor(R.color.notification));

        //Set Custom MessageList .
        String messagesList[] = new String[5];
        messagesList[0] = context.getResources().getString(R.string.notification_inbox_message1);
        messagesList[1] = context.getResources().getString(R.string.notification_inbox_message2);
        messagesList[2] = context.getResources().getString(R.string.notification_inbox_message3);
        messagesList[3] = context.getResources().getString(R.string.notification_inbox_message4);
        messagesList[4] = context.getResources().getString(R.string.notification_inbox_message5);
        //Set Custom Style .
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        //Set MessageTitle .
        inboxStyle.setBigContentTitle((context.getResources()
                .getString(R.string.notification_inbox_text_1)) + (messagesList.length) + (context.getResources()
                .getString(R.string.notification_inbox_text_2)));
        //Show MessageList in Notification.
        for (int i = 0; i < messagesList.length; i++) {
            inboxStyle.addLine(messagesList[i]);
        }
        //Set Style For Notification By Passing Custom Style.
        notification.setStyle(inboxStyle);

        //Set Intent To Notification.
        notification.setContentIntent(pendingIntent);
        //Set NotificationManager For Running In Background .
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        //Call Notification .
        notificationManager.notify(notificationId, notification.build());
    }
}
