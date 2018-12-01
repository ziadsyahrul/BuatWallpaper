package com.jihad.buatwallpaper;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;

public class ThemeActivity extends AppCompatActivity {

    LinearLayout theme_preview;
    Button btn_back, btn_save;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        btn_back = (Button) findViewById(R.id.btn_back);
        btn_save = (Button) findViewById(R.id.btn_save);
        theme_preview = (LinearLayout) findViewById(R.id.theme_preview);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("PATH_PICTURE");
                if (newString.equals("btn_1")) {
                    theme_preview.setBackgroundResource(R.drawable.bg_1);

                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_1);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (newString.equals("btn_2")) {
                    theme_preview.setBackgroundResource(R.drawable.bg_2);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_2);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });


                } else if (newString.equals("btn_3")){
                    theme_preview.setBackgroundResource(R.drawable.bg_3);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil Dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_3);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (newString.equals("btn_4")){
                    theme_preview.setBackgroundResource(R.drawable.bg_4);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil Dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_4);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (newString.equals("btn_5")){
                    theme_preview.setBackgroundResource(R.drawable.bg_5);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil Dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_5);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (newString.equals("btn_6")) {
                    theme_preview.setBackgroundResource(R.drawable.bg_6);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil Dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_6);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (newString.equals("btn_7")) {
                    theme_preview.setBackgroundResource(R.drawable.bg_7);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil Dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_7);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (newString.equals("btn_8")) {
                    theme_preview.setBackgroundResource(R.drawable.bg_8);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil Dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_8);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (newString.equals("btn_9")) {
                    theme_preview.setBackgroundResource(R.drawable.bg_9);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Wallpaper Berhasil Dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.bg_9);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        }

            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
                }
            });

        }
    }

