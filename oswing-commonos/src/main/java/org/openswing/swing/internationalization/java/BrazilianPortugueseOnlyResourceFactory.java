package org.openswing.swing.internationalization.java;

import java.util.Properties;
import org.openswing.swing.util.java.Consts;

/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Class for retrieve the collection of all internationalization properties:
 * translations, data/numeric/currency formats.
 * No translation is performed, date/numeric/currency formats are based on brazilian-portuguese formats.</p>
 * <p>Copyright: Copyright (C) 2008 Mauro Carniel</p>
 *
 * <p> This file is part of OpenSwing Framework.
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the (LGPL) Lesser General Public
 * License as published by the Free Software Foundation;
 *
 *                GNU LESSER GENERAL PUBLIC LICENSE
 *                 Version 2.1, February 1999
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 *       The author of portuguese translate may be contacted at:
 *           artur.saldanha@gmail.com</p>
 *
 * @author Mauro Carniel/Artur Saldanha
 * @version 1.0
 */
public class BrazilianPortugueseOnlyResourceFactory extends ResourcesFactory {
   /** internationalization settings */
   private Resources resources = null;

   /**
    * Constructor.
    * Currency symbol is based on Real
    * @param additionalDictionary additional descriptions
    * @param showResourceNotFoundWarning warn when no resource key not found
    */
   public BrazilianPortugueseOnlyResourceFactory(Properties additionalDictionary, boolean showResourceNotFoundWarning) {
      Properties dictionary = new Properties();
      dictionary.putAll(additionalDictionary);
      // grid...
      dictionary.setProperty("of","de");
      dictionary.setProperty("page","Page");
      dictionary.setProperty("Remove Filter", "Remover filtro");
      dictionary.setProperty("This column is not sorteable", "Esta coluna n�o � classific�vel");
      dictionary.setProperty("Sorting not allowed", "Classifica��o n�o permitida");
      dictionary.setProperty("Maximum number of sorted columns", "N�mero m�ximo de colunas classific�veis");
      dictionary.setProperty("Sorting not applicable", "Classifica��o n�o aplic�vel");
      dictionary.setProperty("Selected Row", "Linha selecionada");
      dictionary.setProperty("Selected Rows", "Linhas selecionadas");
      dictionary.setProperty("Cancel changes and reload data?", "Desconsidera altera��es e recarrega dados?");
      dictionary.setProperty("Attention", "Aten��o");
      dictionary.setProperty("Loading data...", "Carga de dados...");
      dictionary.setProperty("Error while loading data", "Erro durante carregamento de dados");
      dictionary.setProperty("Loading Data Error", "Erro de carga de dados");
      dictionary.setProperty("Delete Rows?", "Exclui as linhas?");
      dictionary.setProperty("Delete Confirmation", "Confirma exclus�o");
      dictionary.setProperty("Error while deleting rows.", "Erro durante a exclus�o de linhas");
      dictionary.setProperty("Deleting Error", "Erro de exclus�o");
      dictionary.setProperty("Error while saving", "Erro durante salvamento");
      dictionary.setProperty("Saving Error", "Erro de salvamento");
      dictionary.setProperty("A mandatory column is empty.", "Uma coluna obriga�ria est� vazia");
      dictionary.setProperty("Value not valid", "Valor n�o v�lido");
      dictionary.setProperty("sorting conditions", "Condi��es de classifica��o");
      dictionary.setProperty("filtering conditions", "Condi��es de filtro");
      dictionary.setProperty("filtering and sorting settings", "Defini��o de filtro e de classifi��o");
      dictionary.setProperty("Filtering/Sorting data (CTRL+F)", "Filtragem/Classifica��o de dados (CTRL+F)");
      // export...
      dictionary.setProperty("grid export", "Exporta��o de dados da grade");
      dictionary.setProperty("export", "Exportar");
      dictionary.setProperty("exportmnemonic", "E");
      dictionary.setProperty("column", "Coluna");
      dictionary.setProperty("sel.", "Sel.");
      dictionary.setProperty("you must select at least one column", "� necess�rio selecionar pelo menos uma coluna");
      dictionary.setProperty("columns to export", "Colunas a exportar");
      dictionary.setProperty("export type", "Formato de exporta��o");
      // import...
      dictionary.setProperty("grid import", "Importa��o de dados para a grade");
      dictionary.setProperty("file to import", "Arquivo a importar");
      dictionary.setProperty("import", "Importar");
      dictionary.setProperty("importmnemonic", "I");
      dictionary.setProperty("columns to import", "Colunas a importar");
      dictionary.setProperty("import type", "Formato de importa��o");
      dictionary.setProperty("error while importing data", "Erro durante a importa��o de dados");
      dictionary.setProperty("import completed", "Importa��o completa");
      // quick filter...
      dictionary.setProperty("To value", "At� ");
      dictionary.setProperty("Filter by", "Filtrar por");
      dictionary.setProperty("From value", "De ");
      dictionary.setProperty("equals", "Igual a ");
      dictionary.setProperty("contains", "Contendo");
      dictionary.setProperty("starts with", "Inicia com");
      dictionary.setProperty("ends with", "Termina com");
      // select/deselect all
      dictionary.setProperty("select all", "Seleciona tudo");
      dictionary.setProperty("deselect all", "Desfaz sele��o de tudo");
      // copy/cut/paste
      dictionary.setProperty("copy", "Copiar");
      dictionary.setProperty("copymnemonic", "C");
      dictionary.setProperty("cut", "Recortar");
      dictionary.setProperty("cutmnemonic", "T");
      dictionary.setProperty("paste", "Colar");
      dictionary.setProperty("pastemnemonic", "O");
      // lookup...
      dictionary.setProperty("Code is not correct.", "C�digo n�o v�lido");
      dictionary.setProperty("Code Validation", "Valida��o de c�digo");
      dictionary.setProperty("Code Selection", "Sele��o de c�digo");
      // form...
      dictionary.setProperty("Confirm deliting data?", "Confirma a dele��o dos dados?");
      dictionary.setProperty("Error while saving: incorrect data.", "Erro durante salvamento: dados nao corretos");
      dictionary.setProperty("Error while validating data:","Erro durante valida��o de datos:");
      dictionary.setProperty("Validation Error","Erro de valida��o");
      dictionary.setProperty("Error on deleting:", "Erro dutante exclus�o:");
      dictionary.setProperty("Error on Loading", "Erro de carga");
      dictionary.setProperty("Error while loading data:", "Erro durante a carga de dados:");
      dictionary.setProperty("Error on setting value to the input control having the attribute name", "Erro durante a defini��o do conte�do para o controle ");
      // toolbar buttons...
      dictionary.setProperty("Delete record (CTRL+D)", "Exclus�o de registro (CTRL+D)");
      dictionary.setProperty("Edit record (CTRL+E)", "Edi��o de registro (CTRL+E)");
      dictionary.setProperty("New record (CTRL+I)", "Novo registro (CTRL+I)");
      dictionary.setProperty("Reload record/Cancel current operation (CTRL+Z)", "Recarrega registro/Cancela opera��o corrente (CTRL+Z)");
      dictionary.setProperty("Save record (CTRL+S)", "Salva o registro (CTRL+S)");
      dictionary.setProperty("Copy record (CTRL+C)", "Copia o registro (CTRL+C)");
      dictionary.setProperty("Export record (CTRL+X)", "Exporta��o dos registros (CTRL+X)");
      dictionary.setProperty("Import records (CTRL+M)", "Importa��o dos registros (CTRL+M)");
      dictionary.setProperty("Load the first block of records", "Carrega o primeiro bloco de dados");
      dictionary.setProperty("Select the previous row in grid", "Seleciona a linha anterior na grade");
      dictionary.setProperty("Select the next row in grid", "Seleciona a proxima linha na grade");
      dictionary.setProperty("Load the previous block of records", "Carrega o bloco de dados anterior");
      dictionary.setProperty("Load the next block of records", "Carrega o proximo bloco de dados");
      dictionary.setProperty("Load the last block of records", "Carrega o �ltimo bloco de dados");
      dictionary.setProperty("Insert", "Inserir");
      dictionary.setProperty("Edit", "Modificar");
      dictionary.setProperty("Copy", "Copiar");
      dictionary.setProperty("Delete", "Excluir");
      dictionary.setProperty("Save", "Salvar");
      dictionary.setProperty("Reload", "Recarregar");
      dictionary.setProperty("Export", "Exportar");
      dictionary.setProperty("Filter", "Filtrar");

      // MDI Frame...
      dictionary.setProperty("file", "Arquivo");
      dictionary.setProperty("filemnemonic", "A");
      dictionary.setProperty("exit", "Sair");
      dictionary.setProperty("exitmnemonic", "R");
      dictionary.setProperty("change user", "Trocar usu�rio");
      dictionary.setProperty("changeusermnemonic", "U");
      dictionary.setProperty("changelanguagemnemonic", "L");
      dictionary.setProperty("help", "Ajuda");
      dictionary.setProperty("about", "Sobre");
      dictionary.setProperty("helpmnemonic", "U");
      dictionary.setProperty("aboutmnemonic", "S");
      dictionary.setProperty("are you sure to quit application?", "Confirma sair da aplica��o?");
      dictionary.setProperty("quit application", "Termina  a aplica��o");
      dictionary.setProperty("forcegcmnemonic", "F");
      dictionary.setProperty("Force GC", "For�a GC");
      dictionary.setProperty("Java Heap", "Java Heap");
      dictionary.setProperty("used", "usado");
      dictionary.setProperty("allocated", "alocado");
      dictionary.setProperty("change language", "Troca linguagem");
      dictionary.setProperty("changemnemonic", "L");
      dictionary.setProperty("cancelmnemonic", "A");
      dictionary.setProperty("cancel", "Cancelar");
      dictionary.setProperty("yes", "Sim");
      dictionary.setProperty("no", "N�o");
      dictionary.setProperty("Functions", "Fun��es");
      dictionary.setProperty("Error while executing function", "Erro duranta a execu��o da fun��o");
      dictionary.setProperty("Error", "Erro");
      dictionary.setProperty("infoPanel", "Info");
      dictionary.setProperty("imageButton", "About");
      dictionary.setProperty("Window", "Janela");
      dictionary.setProperty("windowmnemonic", "J");
      dictionary.setProperty("Close All", "Fechar todas as janelas");
      dictionary.setProperty("closeallmnemonic", "C");
      dictionary.setProperty("closemnemonic", "C");
      dictionary.setProperty("Press ENTER to find function", "Tecle ENTER para localizar fun��o");
      dictionary.setProperty("Find Function", "Localiza fun��o");
      dictionary.setProperty("Operation in progress...", "Processamento em curso...");
      dictionary.setProperty("close window", "Fecha janela");
      dictionary.setProperty("reduce to icon", "Iconiza");
      dictionary.setProperty("save changes?", "Confirma altera��es?");
      dictionary.setProperty("confirm window closing", "Confirma fechamento da janela");
      dictionary.setProperty("switch", "Trocar");
      dictionary.setProperty("switchmnemonic", "T");
      dictionary.setProperty("window name", "Nome da janela");
      dictionary.setProperty("opened windows", "Janela aberta");
      dictionary.setProperty("tile horizontally", "Organiza horizontalmente");
      dictionary.setProperty("tilehorizontallymnemonic", "H");
      dictionary.setProperty("tile vertically", "Organiza verticalmente");
      dictionary.setProperty("tileverticallymnemonic", "V");
      dictionary.setProperty("cascade", "Visualisa em cascata");
      dictionary.setProperty("cascademnemonic", "C");
      dictionary.setProperty("minimize", "Minimizar");
      dictionary.setProperty("minimizemnemonic", "R");
      dictionary.setProperty("minimize all", "Minimizar tudo");
      dictionary.setProperty("minimizeallmnemonic", "T");
      dictionary.setProperty("change background","Change background");
      dictionary.setProperty("reset background","Reset background");
      dictionary.setProperty("selected frame","janela selecionada");

      // server...
      dictionary.setProperty("Client request not supported", "Requisi��o n�o suportada");
      dictionary.setProperty("User disconnected", "Usu�rio desconectado");
      dictionary.setProperty("Updating not performed: the record was previously updated.", "Atualiza��o n�o executada: o registro foi atualizado anteriormente");
      // wizard...
      dictionary.setProperty("back", "Voltar");
      dictionary.setProperty("next", "Avan�ar");
      dictionary.setProperty("finish", "Fim");
      // image panel...
      dictionary.setProperty("image selection", "Seleciona imagem");
      // tip of the day panel...
      dictionary.setProperty("show 'tip of the day' after launching", "Mostra 'dica do dia' ap�s iniciar");
      dictionary.setProperty("previous tip", "Dica anterior");
      dictionary.setProperty("next tip", "Pr�xima dica");
      dictionary.setProperty("close", "Fechar");
      dictionary.setProperty("tip of the day", "Dica do dia");
      dictionary.setProperty("select tip","Seleciona dica");
      dictionary.setProperty("tip name","Nome dica");
      dictionary.setProperty("tips list","Lista de dica");
      // progress panel...
      dictionary.setProperty("progress", "Progresso");
      // licence agreement...
      dictionary.setProperty("i accept the terms in the licence agreement", "Aceito os termos da licen�a");
      dictionary.setProperty("ok", "Ok");
      dictionary.setProperty("i do not accept the terms in the licence agreement", "N�o aceito os termos da licen�a");
      // property grid control
      dictionary.setProperty("property name", "Nome");
      dictionary.setProperty("property value", "Valor");
      // grid profile
      dictionary.setProperty("grid profile management", "Gerenciamento de padr�es");
      dictionary.setProperty("restore default grid profile", "Restaura o padr�o corrente");
      dictionary.setProperty("create new grid profile", "Crea nuovo profilo");
      dictionary.setProperty("profile description", "Descreve o novo padr�o");
      dictionary.setProperty("remove current grid profile", "Remove o padr�o corrente");
      dictionary.setProperty("select grid profile", "Seleciona um padr�o de grade");
      dictionary.setProperty("default profile", "Pad�o");
      // search box
      dictionary.setProperty("search", "Pesquisa");
      dictionary.setProperty("not found", "N�o localizado");

      dictionary.setProperty("Caps lock pressed","Caps lock pressionada");

      // drag...
      dictionary.setProperty("drag", "Drag");

      dictionary.setProperty(Consts.EQ,"Equals to");
      dictionary.setProperty(Consts.GE,"Greater or equals to");
      dictionary.setProperty(Consts.GT,"Greater than");
      dictionary.setProperty(Consts.IS_NOT_NULL,"Is filled");
      dictionary.setProperty(Consts.IS_NULL,"Is not filled");
      dictionary.setProperty(Consts.LE,"Less or equals to");
      dictionary.setProperty(Consts.LIKE,"Contains");
      dictionary.setProperty(Consts.LT,"Less than");
      dictionary.setProperty(Consts.NEQ,"Not equals to");
      dictionary.setProperty(Consts.IN,"Contains values");
      dictionary.setProperty(Consts.ASC_SORTED,"Ascending");
      dictionary.setProperty(Consts.DESC_SORTED,"Descending");
      dictionary.setProperty(Consts.NOT_IN,"Not contains values");

      resources = new Resources(dictionary, "R$", ',', '.', Resources.DMY, true, '/', "HH:mm", "PT_BR", showResourceNotFoundWarning);
   }

   /**
    * @return internationalization settings, according with the current language
    */
   public final Resources getResources() {
      return resources;
   }

   /**
    * Load dictionary, according to the specified language id.
    * @param langId language id identifier
    */
   public final void setLanguage(String langId) throws UnsupportedOperationException {
      if (!resources.getLanguageId().equals(langId))
         throw new UnsupportedOperationException("L�ngua n�o suportada.");
   }

   /**
    * @param langId language id identifier
    * @return internationalization settings, according with the language specified
    */
   public final Resources getResources(String langId) throws UnsupportedOperationException {
      if (!resources.getLanguageId().equals(langId))
         throw new UnsupportedOperationException("C�digo de l�ngua n�o suportada.");
      return resources;
   }
}
