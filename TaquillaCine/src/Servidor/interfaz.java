package Servidor;

import Cliente.Cliente;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class interfaz extends javax.swing.JFrame {
    
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
    private static int clientesEspera = 0;              // cantidad de clientes en espera
    private Crear c = new Crear();                      // Instancia del hilo para crear clientes
    public boolean[] ocupado = new boolean[3];    // Array para verificar los cajeros disponibles
    public Cajero[] cajeros = {new Cajero(),new Cajero(),new Cajero()}; 
    public boolean[] arrayEspera = new boolean[4];      // Array para verificar los lugares disponibles
    public DefaultListModel modelo = new DefaultListModel();

    public interfaz() {
        //this.clientes = clientes; 
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelEspera1.setVisible(false);
        jLabelEspera2.setVisible(false);
        jLabelEspera3.setVisible(false);
        jLabelEspera4.setVisible(false);
        c.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelBarberoS = new javax.swing.JLabel();
        jLabelBarbero2S = new javax.swing.JLabel();
        jLabelBarbero3S = new javax.swing.JLabel();
        jLabelBarberoA = new javax.swing.JLabel();
        jLabelBarbero2A = new javax.swing.JLabel();
        jLabelBarbero3A = new javax.swing.JLabel();
        jLabelEspera1 = new javax.swing.JLabel();
        jLabelEspera2 = new javax.swing.JLabel();
        jLabelEspera3 = new javax.swing.JLabel();
        jLabelEspera4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProcesosFuera = new javax.swing.JList<>();
        jLabelAtencion3 = new javax.swing.JLabel();
        jLabelatencion1 = new javax.swing.JLabel();
        jLabelatencion2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabeltotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelestado1 = new javax.swing.JLabel();
        jLabelestado2 = new javax.swing.JLabel();
        jLabelestado3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabeLacum1 = new javax.swing.JLabel();
        jLabelacum2 = new javax.swing.JLabel();
        jLabelacum3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBarberoS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/taquilla_vacia.png"))); // NOI18N
        jPanel1.add(jLabelBarberoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabelBarbero2S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/taquilla_vacia.png"))); // NOI18N
        jPanel1.add(jLabelBarbero2S, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabelBarbero3S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/taquilla_vacia.png"))); // NOI18N
        jPanel1.add(jLabelBarbero3S, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabelBarberoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/taquilla_ocupada.png"))); // NOI18N
        jPanel1.add(jLabelBarberoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabelBarbero2A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/taquilla_ocupada.png"))); // NOI18N
        jPanel1.add(jLabelBarbero2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabelBarbero3A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/taquilla_ocupada.png"))); // NOI18N
        jPanel1.add(jLabelBarbero3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabelEspera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabelEspera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabelEspera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabelEspera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Taquilla");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 220, 30));

        jListProcesosFuera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jListProcesosFuera);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 110, 350));

        jLabelAtencion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelAtencion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabelatencion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelatencion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        jLabelatencion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelatencion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel7.setText("ESTADO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 60, -1));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabeltotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeltotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabeltotal);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TOTAL:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 110, -1));

        jLabelestado1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabelestado2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabelestado3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel13.setText("Cajero 1:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 20));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel14.setText("Cajero 2:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel15.setText("Cajero 3:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, 20));

        jLabeLacum1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabeLacum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 140, 20));

        jLabelacum2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabelacum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, 20));

        jLabelacum3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabelacum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 140, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llamarProceso(){
        c.nuevoProceso();
    }
    public int disminuir(int semaforo) {
        semaforo--;
        return semaforo;
    }
     public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    //Crea un proceso(Cliente)
    public class Crear extends Thread {

        public void run() {
            while (true) {
                // Inicio semáforo
                if (!jLabelestado1.getText().equals("Cobrando")) {
                    jLabelestado1.setForeground(new Color(60, 63, 65));
                }
                if (!jLabelestado2.getText().equals("Cobrando")) {
                    jLabelestado2.setForeground(new Color(60, 63, 65));
                }
                if (!jLabelestado3.getText().equals("Cobrando")) {
                    jLabelestado3.setForeground(new Color(60, 63, 65));
                }
                for (int x = 0; x < ocupado.length; x++) {
                    //Cliente cliente = new Cliente();
                    if (!ocupado[x]) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        quitarCliente(x + 1);
                        dormir(x + 1);
                    } else {
                        activar(x + 1);
                    }
                }

                for (int x = 0; x < arrayEspera.length; x++) {
                    if (!arrayEspera[x]) {
                        desocuparLugarEspera(x + 1);
                        if (!modelo.isEmpty()) {
                            ocuparFila(indexLugarVacio() + 1);
                            modelo.remove(0);
                            jListProcesosFuera.setModel(modelo);
                            arrayEspera[x] = true;
                        }

                    }
                }
            }
        }

        private void ocuparFila(int lugar) {
            switch (lugar) {
                case 1:
                    jLabelEspera1.setVisible(true);
                    break;
                case 2:
                    jLabelEspera2.setVisible(true);
                    break;
                case 3:
                    jLabelEspera3.setVisible(true);
                    break;
                case 4:
                    jLabelEspera4.setVisible(true);
                    break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void nuevoProceso() {
            int contador = -1;
            boolean bandera = false;
            for (int x = 0; x < cajeros.length; x++) {
                if (!ocupado[x]) {
                    ocupado[x]=true;
                    contador = x + 1;
                    bandera = true;
                    break;
                }
            }
            if (bandera) {
                despertar(contador);
            } else {
                //Si todos los cajeros están ocupados, examina los lugares
                for (int x = 0; x < arrayEspera.length; x++) {
                    if (!arrayEspera[x]) {
                        arrayEspera[x] = true;
                        contador = x + 1;
                        bandera = true;
                        break;
                    }
                }
                if (bandera) {
                    ocuparFila(contador);
                } else {
                    // Colocar en línea de espera "afuera"
                    modelo.addElement("Cliente en espera");
                    jListProcesosFuera.setModel(modelo);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new interfaz().setVisible(true);
            }
        });
    }

    public class atenderCliente extends Thread {

        private int contador = -1;

        public void run() {
            int numeroAleatorio = getRandomNumberInRange(1, 10);
            Cliente cliente = clientes.get(clientes.size()-1);
            try {
                
                System.out.println("El/La Cajero(a): "+cajeros[contador-1].getNombre()+" comienza a atender al cliente: "+cliente.getNombre()+" ::>");
                System.out.println("Pelicula: "+cliente.getPelicula());
                System.out.println("No. Boletos: "+cliente.getNum_boletos());
                System.out.println("Total: "+cliente.getCantidad_a_pagar());
                Thread.sleep(numeroAleatorio * 10000);
                System.out.println("El/La Cajero(a) "+cajeros[contador-1].getNombre()+" terminó de atender al cliente: "+cliente.getNombre()+" en "+numeroAleatorio*10+ " seg.");
                cajeros[contador-1].addCliente_atendido();
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                clienteSatisfecho(cliente.getCantidad_a_pagar());
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void clienteSatisfecho(int precio) throws InterruptedException {
            //Cliente cliente = new Cliente();
            ocupado[contador - 1] = false;

            if (contador == 1) {
                jLabelestado1.setForeground(new Color(29, 184, 29));
                jLabelestado1.setText("Cobrando");
                actualizarcobro(precio, 0, 0);
//                jLabelestado1.setForeground(new Color(60, 63, 65)); 

            } else if (contador == 2) {
                jLabelestado2.setForeground(new Color(29, 184, 29));
                jLabelestado2.setText("Cobrando");
                actualizarcobro(0, precio, 0);
//                jLabelestado2.setForeground(new Color(60, 63, 65)); 

            } else {
                jLabelestado3.setForeground(new Color(29, 184, 29));
                jLabelestado3.setText("Cobrando");
                actualizarcobro(0, 0, precio);
//                jLabelestado3.setForeground(new Color(60, 63, 65)); 
            }
            verificarEspera();
        }

        private void verificarEspera() {
            if (arrayEspera[0] == true) {
                if (arrayEspera[1] == true) {
                    if (arrayEspera[2] == true) {
                        if (arrayEspera[3] == true) {
                            arrayEspera[3] = false;
                            desocuparLugarEspera(4);
                        } else {
                            arrayEspera[2] = false;
                            desocuparLugarEspera(3);
                        }
                    } else {
                        arrayEspera[1] = false;
                        desocuparLugarEspera(2);
                    }
                } else {
                    arrayEspera[0] = false;
                    desocuparLugarEspera(1);
                }
                ocupado[contador - 1] = true;
                //System.out.println("Hola, te atiende " + contador);
                despertar(contador);
            }
        }
    }

    public boolean lugarEsperaLlenos() {

        // Regresa false si están ocupadas, o true si hay alguna vacía
        int contador = 0;
        if (jLabelEspera1.isVisible()) {
            contador++;
        }
        if (jLabelEspera2.isVisible()) {
            contador++;
        }
        if (jLabelEspera3.isVisible()) {
            contador++;
        }
        if (jLabelEspera4.isVisible()) {
            contador++;
        }

        return !(contador == 4);
    }

    public int indexLugarVacio() {
        if (!jLabelEspera1.isVisible()) {
            return 0;
        }
        if (!jLabelEspera2.isVisible()) {
            return 1;
        }
        if (!jLabelEspera3.isVisible()) {
            return 2;
        }
        if (!jLabelEspera4.isVisible()) {
            return 3;
        }

        return -1;
    }

    public void desocuparLugarEspera(int lugar) {
        switch (lugar) {
            case 1:
                jLabelEspera1.setVisible(false);
                break;
            case 2:
                jLabelEspera2.setVisible(false);
                break;
            case 3:
                jLabelEspera3.setVisible(false);
                break;
            case 4:
                jLabelEspera4.setVisible(false);
                break;
            default:
                break;
        }
    }

    int b1 = 0, b2 = 0, b3 = 0;    //monto acumulado
    int total = 0;        // monto acumulado total

    public void actualizarcobro(int taquilla1, int taquilla2, int taquilla3) {
        if (taquilla1 > 0 & taquilla2 == 0 & taquilla3 == 0) {
            b1 += taquilla1;
            jLabeLacum1.setText("$ " + String.valueOf(b1)+" ("+cajeros[0].getClientes_atendidos()+" clientes)");
            total += taquilla1;
            jLabeltotal.setText("$ " + String.valueOf(total));
        } else if (taquilla1 == 0 & taquilla2 > 0 & taquilla3 == 0) {
            b2 += taquilla2;
            jLabelacum2.setText("$ " + String.valueOf(b2)+" ("+cajeros[1].getClientes_atendidos()+" clientes)");
            total += taquilla2;
            jLabeltotal.setText("$ " + String.valueOf(total));
        } else {
            b3 += taquilla3;
            jLabelacum3.setText("$ " + String.valueOf(b3)+" ("+cajeros[2].getClientes_atendidos()+" clientes)");
            total += taquilla3;
            jLabeltotal.setText("$ " + String.valueOf(total));
        }
    }

    public void actualizarcobro() {
        int preciocorte = 100;
        int b1 = 0, b2 = 0, b3 = 0;    //monto acumulado
        int total = 0;        // monto acumulado total
        jLabeltotal.setText("$ " + String.valueOf(total));
        jLabeLacum1.setText("$ " + String.valueOf(b1));
        jLabelacum2.setText("$ " + String.valueOf(b2));
        jLabelacum3.setText("$ " + String.valueOf(b3));
    }

    public void activar(int cajero) {
        switch (cajero) {
            case 1: {
                jLabelBarberoA.setVisible(true);
                jLabelatencion1.setVisible(true);
                jLabelestado1.setText("Atendiendo");
                break;
            }
            case 2: {
                jLabelBarbero2A.setVisible(true);
                jLabelatencion2.setVisible(true);
                jLabelestado2.setText("Atendiendo");
                break;
            }
            case 3: {
                jLabelBarbero3A.setVisible(true);
                jLabelAtencion3.setVisible(true);
                jLabelestado3.setText("Atendiendo");
                break;
            }
        }
    }

    public int despertar(int cajero) {
        switch (cajero) {
            case 1: {
                jLabelBarberoA.setVisible(true);
                jLabelatencion1.setVisible(true);
                atenderCliente atender = new atenderCliente();
                atender.contador = cajero;
                atender.start();
                break;
            }
            case 2: {
                jLabelBarbero2A.setVisible(true);
                jLabelatencion2.setVisible(true);
                atenderCliente atender = new atenderCliente();
                atender.contador = cajero;
                atender.start();
                break;
            }
            case 3: {
                jLabelBarbero3A.setVisible(true);
                jLabelAtencion3.setVisible(true);
                atenderCliente atender = new atenderCliente();
                atender.contador = cajero;
                atender.start();
                break;
            }
        }
        return 1;
    }

    public void quitarCliente(int cliente) {
        switch (cliente) {
            case 1:
                jLabelatencion1.setVisible(false);
                break;
            case 2:
                jLabelatencion2.setVisible(false);
                break;
            case 3:
                jLabelAtencion3.setVisible(false);
                break;
            default:
                break;
        }
    }

    public int dormir(int cajero) {
        switch (cajero) {
            case 1:
                jLabelBarberoA.setVisible(false);
                jLabelestado1.setText("Descansando");
                break;
            case 2:
                jLabelBarbero2A.setVisible(false);
                jLabelestado2.setText("Descansando");
                break;
            default:
                jLabelBarbero3A.setVisible(false);
                jLabelestado3.setText("Descansando");
                break;
        }
        return 1;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabeLacum1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAtencion3;
    private javax.swing.JLabel jLabelBarbero2A;
    private javax.swing.JLabel jLabelBarbero2S;
    private javax.swing.JLabel jLabelBarbero3A;
    private javax.swing.JLabel jLabelBarbero3S;
    private javax.swing.JLabel jLabelBarberoA;
    private javax.swing.JLabel jLabelBarberoS;
    private javax.swing.JLabel jLabelEspera1;
    private javax.swing.JLabel jLabelEspera2;
    private javax.swing.JLabel jLabelEspera3;
    private javax.swing.JLabel jLabelEspera4;
    private javax.swing.JLabel jLabelacum2;
    private javax.swing.JLabel jLabelacum3;
    private javax.swing.JLabel jLabelatencion1;
    private javax.swing.JLabel jLabelatencion2;
    private javax.swing.JLabel jLabelestado1;
    private javax.swing.JLabel jLabelestado2;
    private javax.swing.JLabel jLabelestado3;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JList<String> jListProcesosFuera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
