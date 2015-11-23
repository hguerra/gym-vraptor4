$()
.ready(
		function() {
			// validate signup form on keyup and submit
			$("#login-form")
			.validate(
					{
						rules : {
							login : {
								required : true,
								minlength : 2
							},
							password : {
								required : true,
								minlength : 5
							},
							confirm_password : {
								required : true,
								minlength : 5,
								equalTo : "#password"
							},
							email : {
								required : true,
								email : true
							},
						},
						messages : {
							login : {
								required : "Please enter a username",
								minlength : "Your username must consist of at least 2 characters"
							},
							password : {
								required : "Please provide a password",
								minlength : "Your password must be at least 5 characters long"
							},
							confirm_password : {
								required : "Please provide a password",
								minlength : "Your password must be at least 5 characters long",
								equalTo : "Please enter the same password as above"
							},
						}
					});

			// validate signup form on keyup and submit
			$("#register-form")
			.validate(
					{
						rules : {
							nome : "required",
							sobreNome : "required",
							login : {
								required : true,
								minlength : 2
							},
							password : {
								required : true,
								minlength : 5
							},
							confirm_password : {
								required : true,
								minlength : 5,
								equalTo : "#password"
							},
							email : {
								required : true,
								email : true
							},
							agree : "required"
						},
						messages : {
							nome : "Please enter your firstname",
							sobreNome : "Please enter your lastname",
							login : {
								required : "Please enter a username",
								minlength : "Your username must consist of at least 2 characters"
							},
							password : {
								required : "Please provide a password",
								minlength : "Your password must be at least 5 characters long"
							},
							confirm_password : {
								required : "Please provide a password",
								minlength : "Your password must be at least 5 characters long",
								equalTo : "Please enter the same password as above"
							},
							email : "Please enter a valid email address",
							agree : "Please accept our policy",
						}
					});

			// propose username by combining first- and lastname
			$("#username").focus(function() {
				var firstname = $("#firstname").val();
				var lastname = $("#lastname").val();
				if (firstname && lastname && !this.value) {
					this.value = firstname + "." + lastname;
				}
			});

			// code to hide topic selection, disable for demo
			var newsletter = $("#newsletter");
			// newsletter topics are optional, hide at first
			var inital = newsletter.is(":checked");
			var topics = $("#newsletter_topics")[inital ? "removeClass"
					: "addClass"]("gray");
			var topicInputs = topics.find("input").attr("disabled",
					!inital);
			// show when newsletter is checked
			newsletter.click(function() {
				topics[this.checked ? "removeClass" : "addClass"]
				("gray");
				topicInputs.attr("disabled", !this.checked);
			});
		});