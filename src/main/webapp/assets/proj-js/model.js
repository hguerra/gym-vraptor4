$(document).ready(function() {
	/* Atributos */
	var $busca = $("#busca");
	var lista = [];

	/* Metodos */

	function submitToController(id) {
		$('#' + id).submit(function(evento) {
			evento.preventDefault();
			$(this).ajaxSubmit({
				dataType : 'text',
			});
		});
	}

	function submitToController(url, data, callbackSuccess, callbackError) {
		$.post(url, data).success(callbackSuccess).error(callbackError);
	}

	function getJson(url, metodo, callbackSuccess, callbackError) {
		$.ajax({
			url : url,
			dataType : 'json',
			type : metodo,
			success : callbackSuccess,
			error : callbackError
		});
	}

	function autoCompletar(data) {
		$.each(data, function(i, objeto) {
			addLista(objeto);
		})

		function addLista(objeto) {
			var args = objeto.nome;
			lista.push(args);
		}
	}

	function gerarHTMLTagSytle(tag, tagToAppend, data, tagStyle, mensagem){
		$(tag).attr(data).css(tagStyle).text(mensagem).appendTo(tagToAppend);
	}

	function gerarHTML(tag, tagToAppend, data, classCss, mensagem){
		$(tag).attr(data).addClass(classCss).text(mensagem).appendTo(tagToAppend);
	}

	function ajaxCall() {
		// your jQuery ajax code

	};
	function getInterval(min){
		return 1000*60*min;
	}


	/* Run */

//	$busca.puts("Busca produtos por nome");
//	autcomplete
//	getJson('produtos/get', 'GET', autoCompletar);
//	$busca.autocomplete({
//	source : lista
//	});

//	//atualizando
//	setInterval(ajaxCall, getInterval(2));

});