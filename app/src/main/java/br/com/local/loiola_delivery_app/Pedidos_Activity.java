package br.com.local.loiola_delivery_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.quickaccesswallet.WalletCard;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Pedidos_Activity extends AppCompatActivity {

    Button btnFacaPedidos, btnMeusPedidos, btnInformacoes;
    LinearLayout expandableview;
    ImageView imageView;
    CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedidos_layout);

        btnFacaPedidos = findViewById(R.id.btnfazerpedido);
        btnMeusPedidos = findViewById(R.id.btnMeusPedidos);
        btnInformacoes = findViewById(R.id.btnInformacoes);
        expandableview = findViewById(R.id.expandableview);
        imageView = findViewById(R.id.mostrartexto);
        cardView = findViewById(R.id.cardview_expandable);



        btnMeusPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MeusPedidos_Activity.class));
            }
        });

        btnFacaPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FacaPedidos_Activity.class));
            }
        });

        btnInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), main_activity.class));
            }
        });

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void mostrarmais(View view) {
        if(expandableview.getVisibility() == View.GONE){
            imageView.setImageDrawable(getDrawable(R.drawable.arrow_up));
            TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
            expandableview.setVisibility(View.VISIBLE);
        }else{
            imageView.setImageDrawable(getDrawable(R.drawable.arrow_down));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            }
            expandableview.setVisibility(View.GONE);
        }

    }
}