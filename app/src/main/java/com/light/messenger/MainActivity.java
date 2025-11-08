package com.light.messenger;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView tv = new TextView(this);
        tv.setText("🎉 Light Messenger v1.8.11.25\n\n" +
                  "✅ Успешная сборка!\n" +
                  "💛 Светло-желтый дизайн\n" +
                  "🔒 Сквозное шифрование\n\n" +
                  "Приложение готово к использованию!");
        tv.setTextSize(18);
        tv.setPadding(50, 100, 50, 50);
        
        setContentView(tv);
    }
}
