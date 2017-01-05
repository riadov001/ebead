<div>
	<table>
		<tr>
			<td><img alt="" src="<%=request.getContextPath()%>/resources/images/panier.jpg"></td>
			<td></td><td class="pan">
			<div>
				<table>
					<tr>
						<td colspan="2"><img alt="" src="imgPanier"
						src="<%=request.getContextPath()%>/resources/images/panier.jpg" onclick="afficherPanier()"></td>
					</tr>
					<tr>
						<td>Nombre de produits:</td><td>${panier.size}</td>
					</tr>
					<tr>
						<td>Total :</td><td>${panier.total}</td>
					</tr>
				</table>
			</div>
		</tr>
	</table>
</div>
<div>
	<table>
		<tr>
			<td>
				<div id="chercher">
					<form action="chercherProduits">
						<input type="text" name="mc" value="${mc }">
						<input type="submit" value="chercher">
					</form>
				</div>
			</td>
			<td>
				<a href="index">Index</a>
			</td>
		</tr>
	</table>
</div>