package org.openswing.swing.internationalization.java;

import java.util.*;
import org.openswing.swing.util.java.Consts;


/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Class for retrieve the collection of all internationalization properties:
 * translations, data/numeric/currency formats.
 * No translation is performed, date/numeric/currency formats are based on english formats.</p>
 * <p>Copyright: Copyright (C) 2006 Mauro Carniel</p>
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
 *       The author may be contacted at:
 *           maurocarniel@tin.it</p>
 *
 * @author Mauro Carniel
 * @version 1.0
 */
public class FrenchOnlyResourceFactory extends
ResourcesFactory {

  /** internationalization settings */
  private Resources resources = null;


  /**
   * Constructor.
   * @param currencySymbol currency symbol
   * @param additionalDictionary additional descriptions
   * @param showResourceNotFoundWarning warn when no resource key not found
   */
  public FrenchOnlyResourceFactory(String currencySymbol,Properties additionalDictionary,boolean showResourceNotFoundWarning) {
    this(currencySymbol,additionalDictionary,showResourceNotFoundWarning,'/');
  }



  /**
   * Constructor.
   * @param currencySymbol currency symbol
   * @param additionalDictionary additional descriptions
   * @param showResourceNotFoundWarning warn when no resource key not found
   * @param dateFormatSeparator date format separator; for example: '-' or '/'
   */
  public FrenchOnlyResourceFactory(String currencySymbol,Properties additionalDictionary,boolean showResourceNotFoundWarning,char dateFormatSeparator) {
    Properties dictionary = new Properties();

    dictionary.putAll(additionalDictionary);

    // grid...
    dictionary.setProperty("Remove Filter","Enlever le filtre");
    dictionary.setProperty("This column is not sorteable","Cette colonne ne peut �tre tri�e");
    dictionary.setProperty("Sorting not allowed","Tri non autoris�");
    dictionary.setProperty("Maximum number of sorted columns","Nombre maximum de colonnes tri�es");
    dictionary.setProperty("Sorting not applicable","Tri impossible");
    dictionary.setProperty("Selected Row","Ligne s�lectionn�e");
    dictionary.setProperty("Selected Rows","Lignes s�lectionn�es");
    dictionary.setProperty("Cancel changes and reload data?","Annuler les modificatins et recharger les donn�es?");
    dictionary.setProperty("Attention","Attention");
    dictionary.setProperty("Loading data...","Chargement des donn�es...");
    dictionary.setProperty("Error while loading data","Erreur lors du chargement des donn�es");
    dictionary.setProperty("Loading Data Error","Erreur de chargement de donn�es");
    dictionary.setProperty("Delete Rows?","Supprimer Lignes?");
    dictionary.setProperty("Delete Confirmation","Confirmation de suppression");
    dictionary.setProperty("Error while deleting rows.","Erreur lors de la suppression des lignes.");
    dictionary.setProperty("Deleting Error","Erreur de suppression");
    dictionary.setProperty("Error while deleting rows.","Erreur lors de la suppresion de lignes.");
    dictionary.setProperty("Error while saving","Erreur lors de l'enregistrement");
    dictionary.setProperty("Saving Error","Erreur d'enregistrement");
    dictionary.setProperty("A mandatory column is empty.","Une colonne obligatoire est vide.");
    dictionary.setProperty("Value not valid","Valeur invalide");
    dictionary.setProperty("sorting conditions","Conditions de tri");
    dictionary.setProperty("filtering conditions","Conditions de filtre");
    dictionary.setProperty("filtering and sorting settings","Param�trage des filtres et tris");
    dictionary.setProperty("Filtering/Sorting data (CTRL+F)","Filtrer/Trier les donn�es (CTRL+F)");

    // export...
    dictionary.setProperty("grid export","Exportation de la grille");
    dictionary.setProperty("export","Exportation");
    dictionary.setProperty("exportmnemonic","X");
    dictionary.setProperty("column","Colonne");
    dictionary.setProperty("sel.","Sel.");
    dictionary.setProperty("you must select at least one column","Vous devez au moins choisir une colonne");
    dictionary.setProperty("columns to export","Colonnes � exporter");
    dictionary.setProperty("export type","Exportation au format");

    // import...
    dictionary.setProperty("grid import","Importation de la grille");
    dictionary.setProperty("file to import","Fichier � importer");
    dictionary.setProperty("import","Import");
    dictionary.setProperty("importmnemonic","M");
    dictionary.setProperty("columns to import","Colonnes � importer");
    dictionary.setProperty("import type","Importation au format");
    dictionary.setProperty("error while importing data","Erreur lors de l'importation de donn�es");
    dictionary.setProperty("import completed","Importation termin�e.");

    // quick filter...
    dictionary.setProperty("To value","A partir de");
    dictionary.setProperty("Filter by","Filtrer par");
    dictionary.setProperty("From value","Jusqu'�");
    dictionary.setProperty("equals","�gal");
    dictionary.setProperty("contains","contient");
    dictionary.setProperty("starts with","commence par");
    dictionary.setProperty("ends with","se termine par");

    // select/deselect all
    dictionary.setProperty("select all","S�lectionner tout");
    dictionary.setProperty("deselect all","D�s�lectionner tout");

    // copy/cut/paste
    dictionary.setProperty("copy","Copier");
    dictionary.setProperty("copymnemonic","C");
    dictionary.setProperty("cut","Couper");
    dictionary.setProperty("cutmnemonic","U");
    dictionary.setProperty("paste","Coller");
    dictionary.setProperty("pastemnemonic","P");

    // lookup...
    dictionary.setProperty("Code is not correct.","Le code n'est pas correct.");
    dictionary.setProperty("Code Validation","Validation du code");
    dictionary.setProperty("Code Selection","S�lection du code");

    // form...
    dictionary.setProperty("Confirm deliting data?","Confirmer la suppresion de donn�es?");
    dictionary.setProperty("Error while saving: incorrect data.","Erreur lors de l'enregistrement: donn�e incorrecte.");
    dictionary.setProperty("Error while validating data:","Erreur lors de validation de donn�es:");
    dictionary.setProperty("Validation Error","Error du validation");
    dictionary.setProperty("Error on deleting:","Erreur sur suppression:");
    dictionary.setProperty("Error on Loading","Erreur sur Chargement");
    dictionary.setProperty("Error while loading data:","Erreur lors du chargement de donn�es:");
    dictionary.setProperty("Error on setting value to the input control having the attribute name","Erreur lors de l'initialisation de valeur du contr�le ayant le nom d'attribut");

    // toolbar buttons...
    dictionary.setProperty("Delete record (CTRL+D)","Supprimer enregistrement (CTRL+D)");
    dictionary.setProperty("Edit record (CTRL+E)","Editer enregistrement (CTRL+E)");
    dictionary.setProperty("New record (CTRL+I)","Nouvel enregistrement (CTRL+I)");
    dictionary.setProperty("Reload record/Cancel current operation (CTRL+Z)","Recharger enregistrement/Annuler op�ration courante (CTRL+Z)");
    dictionary.setProperty("Save record (CTRL+S)","Enregistrer (CTRL+S)");
    dictionary.setProperty("Copy record (CTRL+C)","Copier (CTRL+C)");
    dictionary.setProperty("Export record (CTRL+X)","Exporter les enregistrements (CTRL+X)");
    dictionary.setProperty("Import records (CTRL+M)","Importer les enregistrements (CTRL+M)");
    dictionary.setProperty("Load the first block of records","Charger le premier bloc d'enregistrements");
    dictionary.setProperty("Select the previous row in grid","S�lectionner la ligne pr�c�dente de la grille");
    dictionary.setProperty("Select the next row in grid","S�lectionner la ligne suivante de la grille");
    dictionary.setProperty("Load the previous block of records","Charger le bloc d'enregistrements pr�c�dent");
    dictionary.setProperty("Load the next block of records","Charger le bloc d'enregistrements suivant");
    dictionary.setProperty("Load the last block of records","Charger le dernier bloc d'enregistrements");

    dictionary.setProperty("Insert","Ins�rer");
    dictionary.setProperty("Edit","Editer");
    dictionary.setProperty("Copy","Copier");
    dictionary.setProperty("Delete","Supprimer");
    dictionary.setProperty("Save","Enregistrer");
    dictionary.setProperty("Reload","Recharger");
    dictionary.setProperty("Export","Exporter");
    dictionary.setProperty("Filter","Filtrer");

    // binding messages...
    dictionary.setProperty("value must be of type ","La valeur doit �tre de type ");
    dictionary.setProperty("decimal number","Nombre d�cimal");
    dictionary.setProperty("value is ","La valeur est ");
    dictionary.setProperty("optional","Optionnel(le)");
    dictionary.setProperty("minimum value is ","La valeur minimale est ");
    dictionary.setProperty("required","obligatoire");
    dictionary.setProperty("contains a value not valid","contient une valeur invalide");
    dictionary.setProperty("text","texte");
    dictionary.setProperty("Date","date");
    dictionary.setProperty("Value is required","Valeur obligatoire");
    dictionary.setProperty("maximum value is ","La valeur maximale est ");
    dictionary.setProperty("yes/no","oui/no");
    dictionary.setProperty("long number","nombre de type long");
    dictionary.setProperty("integer number","nombre entier");
    dictionary.setProperty("Cannot assign component value","Ne peut assigner la valeur du composant");

    // ClientUtils...
    dictionary.setProperty("Server Comunication Error","Erreur de communication avec le serveur");
    dictionary.setProperty("Server Error","Erreur Serveur");

    // MDI Frame...
    dictionary.setProperty("file","Fichier");
    dictionary.setProperty("exit","Quitter");
    dictionary.setProperty("filemnemonic","F");
    dictionary.setProperty("exitmnemonic","E");
    dictionary.setProperty("change user","Changer d'Utilisateur");
    dictionary.setProperty("changeusermnemonic","U");
    dictionary.setProperty("changelanguagemnemonic","L");
    dictionary.setProperty("help","Aide");
    dictionary.setProperty("about","A propos");
    dictionary.setProperty("helpmnemonic","H");
    dictionary.setProperty("aboutmnemonic","A");
    dictionary.setProperty("are you sure to quit application?","Etes-vous s�r de vouloir quitter l'application?");
    dictionary.setProperty("quit application","Quitter application");
    dictionary.setProperty("about","A propos");
    dictionary.setProperty("forcegcmnemonic","F");
    dictionary.setProperty("Force GC","Force GC");
    dictionary.setProperty("Info","Info");
    dictionary.setProperty("About","A propos");
    dictionary.setProperty("Java Heap","Java Heap");
    dictionary.setProperty("used","utilis�");
    dictionary.setProperty("allocated","allou�");
    dictionary.setProperty("change language","Changer de langue");
    dictionary.setProperty("changemnemonic","L");
    dictionary.setProperty("cancelmnemonic","C");
    dictionary.setProperty("cancel","Annuler");
    dictionary.setProperty("yes","Oui");
    dictionary.setProperty("no","Non");
    dictionary.setProperty("Functions","Fonctions");
    dictionary.setProperty("Error while executing function","Erreur lors de l'ex�cution de la fonction");
    dictionary.setProperty("Error","Erreur");
    dictionary.setProperty("infoPanel","Info");
    dictionary.setProperty("imageButton","A propos");
    dictionary.setProperty("Window","Fen�tre");
    dictionary.setProperty("windowmnemonic","W");
    dictionary.setProperty("Close All","Fermer tout");
    dictionary.setProperty("closeallmnemonic","A");
    dictionary.setProperty("closemnemonic","F");
    dictionary.setProperty("Press ENTER to find function","Appuyer sur ENTRER pour touver la fonction");
    dictionary.setProperty("Find Function","Trouver Fonction");
    dictionary.setProperty("Operation in progress...","Op�ration en cours...");
    dictionary.setProperty("close window","Fermer la fen�tre");
    dictionary.setProperty("reduce to icon","R�duire en ic�ne");
    dictionary.setProperty("are you sure to close this window?","Etes-vous s�r de vouloir fermer cette fen�tre?\nLes changements non enregistr�s seront perdus.");
    dictionary.setProperty("confirm window closing","Confirmer la fermeture de la fen�tre");

    dictionary.setProperty("switch","Basculer");
    dictionary.setProperty("switchmnemonic","S");
    dictionary.setProperty("window name","Nom de la fen�tre");
    dictionary.setProperty("opened windows","Fen�tres ouvertes");
    dictionary.setProperty("tile horizontally","Carreau horizontal");
    dictionary.setProperty("tilehorizontallymnemonic","H");
    dictionary.setProperty("tile vertically","Carreau vertical");
    dictionary.setProperty("tileverticallymnemonic","V");
    dictionary.setProperty("cascade","Cascade");
    dictionary.setProperty("cascademnemonic","C");
    dictionary.setProperty("minimize","Minimiser");
    dictionary.setProperty("minimizemnemonic","M");
    dictionary.setProperty("minimize all","Minimiser tout");
    dictionary.setProperty("minimizeallmnemonic","A");
    dictionary.setProperty("selected frame","fen�tre s�lectionn�e");

    // server...
    dictionary.setProperty("Client request not supported","Requ�te cliente non support�e");
    dictionary.setProperty("User disconnected","Client d�connect�");
    dictionary.setProperty("Updating not performed: the record was previously updated.","Mise � jour non r�alis�e: l'enregistrement a �t� pr�c�demment mis � jour .");

    // wizard...
    dictionary.setProperty("back","Retour");
    dictionary.setProperty("next","Suivant");
    dictionary.setProperty("finish","Termin�");

    // image panel...
    dictionary.setProperty("image selection","S�lection de l'image");

    // tip of the day panel...
    dictionary.setProperty("show 'tip of the day' after launching","Montrer 'astuce du jour' apr�s d�marrage");
    dictionary.setProperty("previous tip","Astuce pr�c�dente");
    dictionary.setProperty("next tip","Astuce suivante");
    dictionary.setProperty("close","Fermer");
    dictionary.setProperty("tip of the day","Astuce du jour");
    dictionary.setProperty("select tip","S�lect astuce");
    dictionary.setProperty("tip name","Nom de la astuce");
    dictionary.setProperty("tips list","Lista astuce");

    // progress panel...
    dictionary.setProperty("progress","Progression");

    // licence agreement...
    dictionary.setProperty("i accept the terms in the licence agreement","J'accepte les termes de la licence");
    dictionary.setProperty("ok","Ok");
    dictionary.setProperty("i do not accept the terms in the licence agreement","Non, je n'accepte pas les termes de la licence");

    // property grid control
    dictionary.setProperty("property name","Nom");
    dictionary.setProperty("property value","Valeur");

    // grid profile
    dictionary.setProperty("grid profile management","Gestion des profils de grille");
    dictionary.setProperty("restore default grid profile","Restaurer le profil par d�faut de la grille ");
    dictionary.setProperty("create new grid profile","Cr�er un nouveau profil de grille");
    dictionary.setProperty("profile description","Description du profil");
    dictionary.setProperty("remove current grid profile","Enlever le profil de grille actuel");
    dictionary.setProperty("select grid profile","S�lectionner le profil de la grille");
    dictionary.setProperty("default profile","Profil par d�faut");

    // search box
    dictionary.setProperty("search","Chercher");
    dictionary.setProperty("not found","Non trouv�");

    // drag...
    dictionary.setProperty("drag","Glisser");

    dictionary.setProperty("Caps lock pressed","De verrouillage des majuscules enfonc�e");

    // pivot table...
    dictionary.setProperty("pivot table settings","Param�trage du tableau crois�");
    dictionary.setProperty("row fields","Champs en Lignes");
    dictionary.setProperty("column fields","Champs en colonnes");
    dictionary.setProperty("data fields","Champs de donn�es");
    dictionary.setProperty("filtering conditions","Conditions de filtres");
    dictionary.setProperty("field","Champ");
    dictionary.setProperty("checked","V�rifi�");
    dictionary.setProperty("at least one data field must be selected","Un champ de donn�e doit au moins �tre s�lectionn�.");
    dictionary.setProperty("at least one row field must be selected","Un champ en ligne doit au moins �tre s�lectionn�.");
    dictionary.setProperty("at least one column field must be selected","Un champ en colonne doit au moins �tre s�lectionn�.");
    dictionary.setProperty("expand all","D�velopper tout");
    dictionary.setProperty("collapse all","R�duire tout");

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

    resources = new Resources(
      dictionary,
      currencySymbol,
      '.',
      ',',
      Resources.YMD,
      true,
      dateFormatSeparator,
      "HH:mm",
      "FR",
      showResourceNotFoundWarning
    );
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
      throw new UnsupportedOperationException("Language identifier not supported.");
  }


  /**
   * @param langId language id identifier
   * @return internationalization settings, according with the language specified
   */
  public final Resources getResources(String langId) throws UnsupportedOperationException {
    if (!resources.getLanguageId().equals(langId))
    throw new UnsupportedOperationException("Language identifier not supported.");
    return resources;
  }



}
