// MusicPlayer.java
public interface MusicPlayer {
  void play();
  void pause();
  void selectMusic();
}

// Phone.java
public interface Phone {
  void call();
  void answer();
  void voiceMail();
}

// InternetBrowser.java
public interface InternetBrowser {
  void displayPage();
  void addTab();
  void updatePage();
}

// iPhone.java
public class iPhone implements MusicPlayer, Phone, InternetBrowser {
  @Override
  public void play() {
      // Implementação para tocar música
  }

  @Override
  public void pause() {
      // Implementação para pausar música
  }

  @Override
  public void selectMusic() {
      // Implementação para selecionar uma música
  }

  @Override
  public void call() {
      // Implementação para fazer uma chamada
  }

  @Override
  public void answer() {
      // Implementação para atender uma chamada
  }

  @Override
  public void voiceMail() {
      // Implementação para iniciar o correio de voz
  }

  @Override
  public void displayPage() {
      // Implementação para exibir uma página na Internet
  }

  @Override
  public void addTab() {
      // Implementação para adicionar uma nova aba no navegador
  }

  @Override
  public void updatePage() {
      // Implementação para atualizar a página no navegador
  }

  // Outros métodos e propriedades específicos do iPhone
}
