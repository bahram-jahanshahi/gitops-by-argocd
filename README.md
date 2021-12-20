#GitOps by ArgoCD
This project is an attempt to learn the concept of GitOps by utilise ArgoCD.  
The idea is simple but significant. It's a best practice in all the project to have one and only one **Source Of Truth**.  
So what does it mean having only one source ot truth? It means that there should be a source (like a repository on GitHub) which all the resources are located there.
For instance in this case study, all the deployment configurations should be in one source and nowhere else.

### Considerable References
- [What is GitOps, How GitOps works and Why it's so useful](https://www.youtube.com/watch?v=f5EpcWp0THw)  
- [ArgoCD Tutorial for Beginners | GitOps CD for Kubernetes](https://www.youtube.com/watch?v=MeU5_k9ssrs)

### Case Study

### Setup Kubernetes (Minikube)

### Setup Argo CD in Kubernetes
Follow this [getting started](https://argo-cd.readthedocs.io/en/stable/getting_started/) document to install Argo CD.  
####Install Argo CD
```shell
kubectl create namespace argocd
kubectl apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml
```
#### Access Argo CD by port forwarding
Kubectl port-forwarding can also be used to connect to the API server without exposing the service.
```shell
kubectl port-forward svc/argocd-server -n argocd 8080:443
```
#### How to login
The initial password for the admin account is auto-generated and stored as clear text in the field password in a secret named argocd-initial-admin-secret in your Argo CD installation namespace. You can simply retrieve this password using kubectl:  
```shell
kubectl -n argocd get secret argocd-initial-admin-secret -o jsonpath="{.data.password}" | base64 -d; echo
```

### Setup ArgoCD Application in the Project

