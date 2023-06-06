package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardAnimalsMisc extends AppCompatActivity {

    private Button btnMeow, btnMonkey, btnHorse, btnDolphin, btnOink, btnShaboing, btnCrow, btnCaw, btnMoo, btnMonster, btnPipe, btnSheep;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundboard_animalsmisc);

        btnMeow = findViewById(R.id.btn_meow);
        btnMonkey = findViewById(R.id.btn_monkey);
        btnHorse = findViewById(R.id.btn_horse);
        btnDolphin = findViewById(R.id.btn_dolphin);
        btnOink = findViewById(R.id.btn_oink);
        btnShaboing = findViewById(R.id.btn_shaboingboing);
        btnCrow = findViewById(R.id.btn_crow);
        btnCaw = findViewById(R.id.btn_caw);
        btnMoo = findViewById(R.id.btn_moo);
        btnMonster = findViewById(R.id.btn_monster);
        btnPipe = findViewById(R.id.btn_pipe);
        btnSheep = findViewById(R.id.btn_sheep);

        btnMeow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMeow();
            }
        });

        btnMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMonkey();
            }
        });

        btnHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playHorse();
            }
        });

        btnDolphin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDolphin();
            }
        });

        btnOink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playOink();
            }
        });

        btnShaboing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playShaboing();
            }
        });

        btnCrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playCrow();
            }
        });

        btnCaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playCaw();
            }
        });

        btnMoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMoo();
            }
        });

        btnMonster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMonster();
            }
        });

        btnPipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playPipe();
            }
        });

        btnSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSheep();
            }
        });

    }

    private void playMeow() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_meow);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playMonkey() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_monkey);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playHorse() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_horse);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playDolphin() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_dolphin);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playOink() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_oink);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playShaboing() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_shaboingboing);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playCrow() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_crow);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playCaw() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_caw);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
    private void playMoo() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_moo);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playMonster() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_monster);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }


    private void playPipe() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_pipe);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playSheep() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_enrique_sheep);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
}



