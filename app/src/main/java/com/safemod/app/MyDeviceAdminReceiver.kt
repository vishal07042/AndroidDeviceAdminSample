package com.safemod.app








import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyDeviceAdminReceiver : DeviceAdminReceiver() {

    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        Toast.makeText(context, "Device Admin: enabled", Toast.LENGTH_SHORT).show()
        // Additional logic when device admin is enabled
    }

    override fun onDisabled(context: Context, intent: Intent) {
        super.onDisabled(context, intent)
        Toast.makeText(context, "Device Admin: disabled", Toast.LENGTH_SHORT).show()
        // Additional logic when device admin is disabled
    }
}